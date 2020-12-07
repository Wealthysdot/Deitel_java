//package chapterSeven;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class StudentGradeTest {
//    StudentGrade studentGrade;
//
//    @BeforeEach
//    void setUp() {
//        studentGrade = new StudentGrade();
//    }
//
//
//
//    @AfterEach
//    void tearDown() {
//    }
//
//
//    @Test
//    void testSum() {
//        int[] studentScoresArray = {3, 2, 4, 6};
//        int result = studentGrade.calculateSum(studentScoresArray);
//        assertEquals(15, result);
//    }
//
//    @Test
//    void testAverage() {
//        int[] studentScoresArray = {3, 2, 4, 6, 0};
//        double result = studentGrade.calculateAverage(studentScoresArray);
//        assertEquals(5, result);
//    }
//
//
//}