package myDiary;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Entry {
    private String entryTitle;
    private LocalDateTime entryDateAndTime;
    private String entryBody;

    public Entry(String entryTitle) {
        this.entryTitle = entryTitle;
        //set time to the present time of user
        entryDateAndTime = LocalDateTime.now();
    }

    public void setEntryTitle(String newEntryTitle) {
        this.entryTitle = newEntryTitle;
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public LocalDateTime getEntryDateAndTime() {
        return entryDateAndTime;
    }


    public void setEntryBody(String entryBody) {
        this.entryBody = entryBody;

    }

    public String getEntryBody() {
        return entryBody;
    }

    public String viewEntry() {
        return ("Title: " + getEntryTitle() + "\n"
                + "Entry Date: " + getEntryDateAndTime()
                .toLocalDate() + "\n"
                + "Entry Body: " + getEntryBody()
        );
    }

    @Override
    public String toString() {
        return viewEntry();
    }
}
