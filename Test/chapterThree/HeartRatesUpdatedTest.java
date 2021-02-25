package chapterThree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.AssertTrue.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HeartRatesUpdatedTest {
    HeartRatesUpdated newHeartRatesUpdated;
    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void testThatTheyCanEnterNameInString(){
        newHeartRatesUpdated = new HeartRatesUpdated("Adunni", "Eagle", 31, 05, 1994);
        String firstName = newHeartRatesUpdated.getFirstName();
        assertEquals("Adunni", firstName);

    }

    @Test
    void testThatFirstNameCanBeUpdated(){
        newHeartRatesUpdated = new HeartRatesUpdated("Adunni", "Eagle", 31, 05, 1994);
        newHeartRatesUpdated.setFirstName("Akanke");
        assertEquals("Akanke",newHeartRatesUpdated.getFirstName());
    }

    @Test
    void testThatLastNameCanBeEnteredInString(){
        newHeartRatesUpdated = new HeartRatesUpdated("Adunni", "Eagle", 31, 05, 1994);
        String lastName = newHeartRatesUpdated.getLastName();
        assertEquals("Eagle", lastName);

    }

    @Test
    void testThatLastNameCanBeUpdated(){
        newHeartRatesUpdated = new HeartRatesUpdated("Adunni", "Eagle", 31, 05, 1994);
        newHeartRatesUpdated.setLastName("Akanni");
        assertEquals("Akanni", newHeartRatesUpdated.getLastName());

    }

    @Test
    void testToEnterDayOfBirth(){
        newHeartRatesUpdated = new HeartRatesUpdated("Adunni", "Eagle", 31, 05, 1994);
        int day = newHeartRatesUpdated.getDayOfBirth();
        assertEquals(31, day);
    }

    @Test
    void testThatDayOfBirthCanBeUpdated(){
        newHeartRatesUpdated = new HeartRatesUpdated("Adunni", "Eagle", 31, 05, 1994);
        newHeartRatesUpdated.setDayOfBirth(30);
        assertEquals(30,newHeartRatesUpdated.getDayOfBirth());
    }

    @Test
    void testThatMonthOfBirthCanBeEntered(){
        newHeartRatesUpdated = new HeartRatesUpdated("Adunni", "Eagle",31, 05, 1994);
        int month = newHeartRatesUpdated.getMonthOfBirth();
        assertEquals(05,month);
    }

    @Test
    void testThatMonthCanBeUpdated(){
        newHeartRatesUpdated = new HeartRatesUpdated("Adunni", "Eagle", 31, 05, 1994);
        newHeartRatesUpdated.setMonthOfBirth(03);
        assertEquals(03,newHeartRatesUpdated.getMonthOfBirth());
    }

    @Test
    void testThatYearOfBirthCanBeEntered(){
        newHeartRatesUpdated = new HeartRatesUpdated("Adunni", "Eagle", 31, 05, 1994);
        int year = newHeartRatesUpdated.getYearOfBirth();
        assertEquals(1994, year);
    }

    @Test
    void testThatYearCanBeUpdated(){
        newHeartRatesUpdated = new HeartRatesUpdated("Adunni", "Eagle", 31,05,1994);
        newHeartRatesUpdated.setYearOfBirth(1995);
        assertEquals(1995,newHeartRatesUpdated.getYearOfBirth());
    }

    @Test
    void testToWriteDateInAGivenFormat(){
    newHeartRatesUpdated = new HeartRatesUpdated("Adunni", "Eagle", 31, 05,1994);
        String stringedDate = newHeartRatesUpdated.toString();
            assertEquals("1994/5/31", stringedDate);

    }

    @Test
    void testToCheckThatNegativeDayAreNotEntered(){
        newHeartRatesUpdated = new HeartRatesUpdated("Adunni", "Eagle", 31, 05,1994);
        newHeartRatesUpdated.setDayOfBirth(31);
        newHeartRatesUpdated.setDayOfBirth(-5);
        assertEquals(31,newHeartRatesUpdated.getDayOfBirth());
        assertTrue(newHeartRatesUpdated.isNegativeValueEntered());
        assertEquals("Invalid input", newHeartRatesUpdated.getInputErrorMessage());

    }

    @Test
    void testToCheckThatNegativeMonthAreNotEntered(){
        newHeartRatesUpdated = new HeartRatesUpdated("Adunni", "Eagle", 31, 05,1994);
        newHeartRatesUpdated.setMonthOfBirth(5);
        newHeartRatesUpdated.setMonthOfBirth(-5);
        assertEquals(5,newHeartRatesUpdated.getMonthOfBirth());
        assertTrue(newHeartRatesUpdated.isNegativeValueEntered());
        assertEquals("Invalid input", newHeartRatesUpdated.getInputErrorMessage());

    }

    @Test
    void testToCheckThatNegativeYearAreNotEntered(){
        newHeartRatesUpdated = new HeartRatesUpdated("Adunni", "Eagle", 31, 05,1994);
        newHeartRatesUpdated.setYearOfBirth(1994);
        newHeartRatesUpdated.setYearOfBirth(-1994);
        assertEquals(1994,newHeartRatesUpdated.getYearOfBirth());
        assertTrue(newHeartRatesUpdated.isNegativeValueEntered());
        assertEquals("Invalid input", newHeartRatesUpdated.getInputErrorMessage());

    }


}
