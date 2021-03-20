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
    void testToCheckTheStatusOfNumber(){
        int num = evenOrOdd.getEven();
        assertTrue(true);
    }

//    @Test
//    void testToCheckNumberCanBeUpdated(){
//
//    }


}