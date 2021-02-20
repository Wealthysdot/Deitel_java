//package chapterThree;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class DateTest {
//
//    @BeforeEach
//    void setUp() {
//    }
//
//    @AfterEach
//    void tearDown() {
//    }
//
//
//    @Test
//    void toTestThatUserInputADigitInTheMonthSpace() {
//        Date newDate = new Date(05);
//        int month = newDate.getMonth();
//        assertEquals(05, month);
//    }
//
//
//
//    @Test
//    void toTestThatUserCanUpdateInput(){
//        Date newDate = new Date(03);
//        newDate.setMonth(7);
//        assertEquals(7, newDate.getMonth() );
//    }
//    @Test
//    void toTestThatUserDoesNotInputMoreThanTwelveMonth(){
//        Date newDate = new Date(12);
//    newDate.getMonth();
//    assertEquals(12,);
//
////    }
//}