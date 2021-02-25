package chapterTwo.whatever;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMITest {
    whatever.BMI newBMI;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    ;

    @Test
    void testThatWeightInKilogramIsEntered() {
        newBMI = new whatever.BMI(65.7, 1.57, 0);
        double weight = newBMI.getWeight();
        assertEquals(65.7, weight);
    }

    @Test
    void testThatHeightInMetersIsEntered() {
        newBMI = new whatever.BMI(65.7, 1.57, 0);
        double height = newBMI.getHeight();
        assertEquals(1.57, height);
    }

    @Test
    void testThatWeightCanBeUpdated() {
        newBMI = new whatever.BMI(65.7, 1.57, 0);
        newBMI.setWeight(50.0);
        assertEquals(50.0, newBMI.getWeight());
    }

    @Test
    void testThatHeightCanBeUpdated() {
        newBMI = new whatever.BMI(65.7, 1.57, 0);
        newBMI.setHeight(1.47);
        assertEquals(1.47, newBMI.getHeight());
    }

    //  to test for the calculation of BMI
    @Test
    void toTestCalculationsForBMI() {
        newBMI = new whatever.BMI(65.7, 1.57, 0);
        newBMI.setWeight(45.0);
        newBMI.setHeight(1.89);
        double BMICalc = newBMI.calculatingBMI();
        assertEquals(12.597631645250694, BMICalc);
    }

    @Test
    void toCheckBMIValueMethod() {
        newBMI = new whatever.BMI(65.7, 1.57, 0);
        newBMI.setWeight(45.0);
        newBMI.setHeight(1.89);
        double BMICalc = newBMI.calculatingBMI();
        assertEquals(12.597631645250694, BMICalc);
        String display = newBMI.checkBMIValue();
    }


    @Test
    void testThatNegativeWeightNumberCannotBeEntered() {
        newBMI = new whatever.BMI(65.7, 1.57, 0);
        newBMI.setWeight(65.7);
        newBMI.setWeight(-65.7);
        assertEquals(65.7, newBMI.getWeight());
        assertTrue(newBMI.isNegativeValueEntered());
        assertEquals("Please enter a positive number", newBMI.getInputErrorMessage());
    }

    @Test
    void testThatNegativeHeightNumberCannotBeEntered(){
        newBMI = new whatever.BMI(65.7, 1.57, 0);
        newBMI.setHeight(1.57);
        newBMI.setHeight(-1.57);
        assertEquals(1.57, newBMI.getHeight());
        assertTrue(newBMI.isNegativeValueEntered());
        assertEquals("Please enter a positive number", newBMI.getInputErrorMessage());
    }

}



