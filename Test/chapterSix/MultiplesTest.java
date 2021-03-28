package chapterSix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {
    Multiples multiples;

    @BeforeEach
    void setUp() {
        multiples = new Multiples(12, 24);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatFirstNumCanBeEntered() {
        int firstNum = multiples.getFirstNum();
        assertEquals(12, firstNum);
    }

    @Test
    void testThatFirstNumCanBeUpdated() {
        multiples.setFirstNum(23);
        assertEquals(23, multiples.getFirstNum());
    }

    @Test
    void testThatSecondNumberCanBeEntered(){
        int secondNum = multiples.getSecondNum();
        assertEquals(24,secondNum);
    }

    @Test
    void testThatSecondNumberCanBeUpdated(){
        multiples.setSecondNum(25);
        assertEquals(25,multiples.getSecondNum());
    }

    @Test
    void testThatOneNumberIsAMultipleOfTheOther(){
        multiples.setFirstNum(4);
        multiples.setSecondNum(2);
        assertTrue( multiples.calcMultiples());
    }
    @Test
    void testThatOneNumberIsNotAMultipleOfTheOther(){
        multiples.setFirstNum(5);
        multiples.setSecondNum(2);
        assertFalse(multiples.calcMultiples());
    }

}


