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
    void testThatNegativeValuCannotBeEntered



}