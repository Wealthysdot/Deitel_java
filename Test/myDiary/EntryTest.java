package myDiary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    Entry entry;

    @BeforeEach
    void setUp() {
        entry = new Entry("Default Title");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testEntryCanChangeTitle() {
        //given
        entry = new Entry("My Title");

        //when
        entry.setEntryTitle("New Entry Title");

        //assert
        String entryTitle = entry.getEntryTitle();
        assertEquals("New Entry Title", entryTitle);

    }

    @Test
    void testDateOfEntryIsCreatedAfterConstruction() {
        //given
        Entry newEntry;
        //when
        newEntry = new Entry("My Title");

        //assert
        LocalDateTime entryDateAndTime = newEntry.getEntryDateAndTime();
        assertNotNull(entryDateAndTime);

        //assert
        LocalDate entryDate = entryDateAndTime.toLocalDate();
        assertEquals(LocalDate.now(), entryDate);
        System.out.println(entryDateAndTime.toString());
    }

    @Test
    void testEntryBodyCanBeEdited() {
        //given
        Entry newEntry = new Entry("New Entry");
        //when
        newEntry.setEntryBody("This is the entry body");

        //assert
        String entryBody = newEntry.getEntryBody();
        assertEquals("This is the entry Body", entryBody);
    }

    @Test
    void testViewEntry() {
        //given
        Entry entry = new Entry("My Breakup Story");
        entry.setEntryBody("It just happened");
        String actual = entry.viewEntry();
        String expected =
                ("Title: " + entry.getEntryTitle() + "\n"
                        + "Entry Date: " + LocalDate.now() + "\n"
                        + "Entry Body: It just happened"
                );

        //assert
        assertEquals(expected, actual);

        actual = entry.toString();
        assertEquals(expected, actual);

    }
}