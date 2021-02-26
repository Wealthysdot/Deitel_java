package chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeUpdatedTest {
    EmployeeUpdated newEmployeeUpdated;

    @BeforeEach
    void setUp() {
        newEmployeeUpdated =  new EmployeeUpdated( "Munirat", "Olayiwola", 2000);

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void toTestThatEmployeeCanEnterTheirName() {

        String firstName = newEmployeeUpdated.getFirstName();
        assertEquals("Munirat", firstName);
    }

    @Test
    void toTestThatFirstNameCanBeUpdated() {

        newEmployeeUpdated.setFirstName("Olaoluwa");
        assertEquals("Olaoluwa", newEmployeeUpdated.getFirstName());

    }

    @Test
    void testThatLastNameCanBeEntered(){
        String lastName = newEmployeeUpdated.getLastName();
        assertEquals("Olayiwola", lastName);
    }

    @Test
    void testThatLastNameCanBeUpdated(){
        newEmployeeUpdated.setLastName("McClean");
        assertEquals("McClean", newEmployeeUpdated.getLastName());
    }

    @Test
    void testThatEmployeeCanEnterTheirSalary(){
        double salary = newEmployeeUpdated.getSalary();
       assertEquals(2000, salary);
    }

    @Test
    void testThatSalaryCanBeUpdated(){
        newEmployeeUpdated.setSalary(4000);
        assertEquals(4000,newEmployeeUpdated.getSalary());
    }

    @Test
    void testThatNegativeSalaryCannotBeEnteredForSalary(){
        newEmployeeUpdated.setSalary(-2000);
        assertEquals(2000, newEmployeeUpdated.getSalary());
        assertTrue(newEmployeeUpdated.isNegativeValueEntered());
        assertEquals("Invalid Entry",newEmployeeUpdated.getInputErrorMessage());
    }

    @Test
    void testToCalculateTenPercentRaise(){
        assertEquals(2200, newEmployeeUpdated.calcSalaryRaise());
    }

    @Test
    void testToCalculateYearlyIncome(){
        assertEquals(26400, newEmployeeUpdated.calcYearlyIncome());
    }
}