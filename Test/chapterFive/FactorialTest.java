package chapterFive;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {
    Factorial factorial;
    @BeforeEach
    void setUp() {
        factorial = new Factorial(5);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatNumberCanBeEntered(){
        factorial.setNum(5);
        assertEquals(5, factorial.getNum());
    }

    @Test
    void testThatNegativeNumberCannotBeEntered(){
        factorial.setNum(-5);
       assertTrue(factorial.isNegativeValueEntered());
       assertEquals(5, factorial.getNum());
       assertEquals("Invalid Entry, Enter a positive number",factorial.getInputErrorMessage());

    }
}