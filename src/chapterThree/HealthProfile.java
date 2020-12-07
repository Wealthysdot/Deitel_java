package chapterThree;

public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private String dayOfBirth;
    private String monthOfBirth;
    private String yearOfBirth;
    private int height;
    private int weight;

    public HealthProfile(String firstName, String lastName, String gender, String dayOfBirth, String monthOfBirth, String yearOfBirth, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(String monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public String getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(String yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    private int age;

    public int getAge() {
        age = 2020 - age;
        return age;
    }

    private int maximumHeartRate;

    public int getMaximumHeartRate() {
        maximumHeartRate = 220 - age;
        return maximumHeartRate;
    }

    private int BMI;

    public int getBMI() {
        BMI = weight / (height * height);
        return BMI;
    }
}
