//package miDiary;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class UserEntryTest {
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
//    void UserEntry_hasTitleAfterConstruction(){
//        //given
//        UserEntry userEntry;
//
//        //when
//        userEntry = new UserEntry("My First Entry");
//
//        //assert
//        String entryTitle = userEntry.getEntryTitle();
//        assertEquals("My First Entry", entryTitle);
//
//
//    }
//
//    @Test
//    void userEntry_hasDateAndTimeOfEntryAfterConstruction(){
//        //given
//        UserEntry userEntry;
//        //
//        userEntry = new UserEntry("My First entry");
//
//        //
//        assertNotNull(userEntry.getDateAndTimeOfEntry());
//    }
//}