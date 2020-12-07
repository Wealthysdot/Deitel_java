package chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class EmployeeTest {
    Employee employee;
    @BeforeEach
    void setUp() {
        employee = new Employee("Dotun","Olayinka", 700.00);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSetFirstNameMethod(){
        employee.setFirstName("Olasukanmi");
        assertEquals("Olasukanmi",employee.getFirstName());
    }

    @Test
    void testSetMonthlySalaryShouldNotSetSalaryIfSalaryAmountIsLessThanZero(){
        employee.setMonthlySalary(-100.0);
        assertEquals(700.00, employee.getMonthlySalary());
    }

    @Test
    void testGetFirstNameMethod(){
        assertEquals("Dotun", employee.getFirstName());
    }

    @Test
    void testGetYearlySalaryMethod(){
        assertEquals(8400, employee.getYearlySalary());
    }

    @Test
    void testIncreaseSalaryMethod(){

    }

}