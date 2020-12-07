package myDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaryTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDiaryEntryIsSet(){
        //given
        Diary myBreakUpDiary = new Diary(5);
        //when
        int numberOfDiaryEntries = myBreakUpDiary.getNumberOfDiaryEntries();
        //assert
        assertEquals(5,numberOfDiaryEntries);
    }

    @Test
    void testDiaryEntryIsNotNull(){
        //given
        Diary myBreakUpDiary;
        //when
        myBreakUpDiary = new Diary(10);
        //assert
        Entry [] entries = myBreakUpDiary.getEntries();
        assertNotNull(entries);
    }


    @Test
    void testDiaryEntryCanBeEntered(){
        //given
        Diary myBreakUpDiary = new Diary(5);
        Entry entry = new Entry("My Break up Story");
        entry.setEntryBody("It just Happened");


        //when
        myBreakUpDiary.addNewEntry(entry);


        //assert
        assertEquals(entry, myBreakUpDiary.getEntries()[0]);


//        Entry[] assertionEntry = new Entry[5];
//        assertionEntry[1] = entry;
//        assertArrayEquals(assertionEntry, myBreakUpDiary.getEntries());

        //given
        Entry entry1 = new Entry("My new found love story");
        entry.setEntryBody("It's amazing");

        //when
        myBreakUpDiary.addNewEntry(entry1);

        assertEquals(entry1, myBreakUpDiary.getEntries()[1]);
    }




}