package chapterFive;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.*;

class SmallestValueTest {
    SmallestValue newSmallestValue;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatWholePositiveIsEntered(){
        newSmallestValue = new SmallestValue(5);
        int digit = newSmallestValue.getDigit();
        assertEquals(5, digit);

    }

    @Test
    void testThatWholePositiveNumberCanBeUpdated(){
        newSmallestValue = new SmallestValue(5);
        newSmallestValue.setDigit(10);
        assertEquals(10,newSmallestValue.getDigit());
    }




//    @Test
//    void testThatNegativeNumberCannotBeEntered(){
//        newSmallestValue = new SmallestValue(5);
//        newSmallestValue.setDigit(5);
//        newSmallestValue.setDigit(-10);
//        assertEquals(5, newSmallestValue.getDigit());
//        assertTrue(newSmallestValue.isNegativeValueEntered());
//        assertEquals("Please enter a positive number", newSmallestValue.getInputErrorMessage());
//    }


}