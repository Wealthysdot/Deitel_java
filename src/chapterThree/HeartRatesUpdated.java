package chapterThree;

public class HeartRatesUpdated {
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;

    public HeartRatesUpdated(String firstName, String lastName, int day, int month, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDayOfBirth() {
        return day;
    }

    public void setDayOfBirth(int day) {
        this.day = day;
    }

    public int getMonthOfBirth() {
        return month;
    }

    public void setMonthOfBirth(int month) {
        this.month = month;
    }

    public int getYearOfBirth() {
        return year;
    }

    public void setYearOfBirth(int year) {
        this.year = year;
    }
}
