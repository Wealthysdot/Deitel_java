package chapterFour;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MileageUpdatedTest {
    MileageUpdated newMileage;

    @BeforeEach
    void setUp() {
         newMileage = new MileageUpdated(2.5, 5.6);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatGallonCanBeEntered(){
        double gallon = newMileage.getGallon();
        assertEquals(2.5, gallon);
    }

    @Test
    void testThatGallonCanBeUpdated(){
        newMileage.setGallon(5.7);
        assertEquals(5.7, newMileage.getGallon());
    }

    @Test
    void testThatMilesCanBeEntered(){
        double miles = newMileage.getMiles();
        assertEquals(5.6,miles);
    }

    @Test
    void testThatMilesCanBeUpdated(){
        newMileage.setMiles(7.5);
        assertEquals(7.5,newMileage.getMiles());
    }

    @Test
    void testThatNegativeValueOfGallonCannotBeEntered(){
        newMileage.setGallon(10.5);
        newMileage.setGallon(-6.5);
        assertEquals(10.5, newMileage.getGallon());
        assertTrue(newMileage.isNegativeValueInput());
        assertEquals("Negative number entered", newMileage.getErrorMessage());
    }


    @Test
    void testThatNegativeValueOfMilesCannotBeEntered(){
        newMileage.setMiles(30);
        newMileage.setMiles(-40);
        assertTrue(newMileage.isNegativeValueInput());
        assertEquals("Negative number entered",newMileage.getErrorMessage());
    }

    @Test
    void testToCalculateMileage(){
        newMileage.setMiles(60);
        newMileage.setGallon(30);
        assertEquals(2, newMileage.calculateMileage());
    }



}