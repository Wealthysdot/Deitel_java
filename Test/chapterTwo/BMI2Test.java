package chapterTwo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BMI2Test {
    BMI2 bmi2;

    @BeforeEach
    void setUp() {
        bmi2 = new BMI2();
    }

    @Test
    void confirmClass(){
        assertNotNull(bmi2);
    }

    @Test
    void checkForValuesInBMI2(){
        bmi2.setWeight(48.0);
        bmi2.setHeight(1.9);
        assertEquals(bmi2.getBodyMassIndex(), 13.29639889196676);
    }

    @Test
    void checkIfUnderWeightTest(){
        bmi2.setWeight(48.0);
        bmi2.setHeight(1.9);
        bmi2.getBodyMassIndex();
        assertEquals(bmi2.checkIfUnderWeight(), "You are Underweight");
    }

    @Test
    void checkIfNormalTest(){
        bmi2.setWeight(48.0);
        bmi2.setHeight(1.5);
        bmi2.getBodyMassIndex();
        assertEquals(bmi2.checkIfNormal(), "You are Normal");
    }

    @Test
    void checkIfOverweightTest(){
        bmi2.setWeight(48.0);
        bmi2.setHeight(1.3);
        bmi2.getBodyMassIndex();
        assertEquals(bmi2.checkIfOverWeight(), "You are Overweight");
    }

    @Test
    void checkIfObeseTest(){
        bmi2.setWeight(48.0);
        bmi2.setHeight(0.9);
        bmi2.getBodyMassIndex();
        assertEquals(bmi2.checkIfObese(), "You are Obese");
    }
}