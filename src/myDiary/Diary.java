package myDiary;


public class Diary {
    private Entry[] entries;

    public Diary(int numberOfDiaryEntries) {
        entries = new Entry[numberOfDiaryEntries];

    }

    public int getNumberOfDiaryEntries() {
        return entries.length;
    }

    public Entry[] getEntries() {
        return entries;
    }

    public void addNewEntry(Entry newDiaryEntry) {
        entries[0]= newDiaryEntry;
    }
}
