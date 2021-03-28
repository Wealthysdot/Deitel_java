package chapterSix;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class EvenOrOddTest {
    EvenOrOdd evenOrOdd;
    @BeforeEach
    void setUp() {
        evenOrOdd = new EvenOrOdd(6);
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatNumberCanEntered(){
        evenOrOdd.setNumber(4);
        assertEquals(4,evenOrOdd.getNumber());

    }
    @Test
    void testToCheckIfNumberIsEven(){
        assertTrue(evenOrOdd.getEven());
    }

    @Test
    void testToCheckIfNumberIsOdd(){
        evenOrOdd.setNumber(5);
        assertFalse(evenOrOdd.getEven());
    }



}