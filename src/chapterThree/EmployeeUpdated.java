package chapterThree;

public class EmployeeUpdated {



    private String firstName;
    private String lastName;
    private double salary;
    private boolean isNegativeValueEntered;

    public EmployeeUpdated( String firstName, String lastName, double salary) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public  String getFirstName() {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0){
            isNegativeValueEntered = true;
        }
        else {
            this.salary = salary;
        }

    }

    public boolean isNegativeValueEntered() {
        return isNegativeValueEntered;
    }

    public String getInputErrorMessage() {
        String messageToReturn = " ";
        if(isNegativeValueEntered = true){
            messageToReturn = "Invalid Entry";
        }
        return messageToReturn;
    }

    public double calcSalaryRaise() {

        double salaryRaise = ((getSalary() * 10) / 100) + getSalary();
        return salaryRaise;
    }

    public double calcYearlyIncome() {
        double yearlySalary = calcSalaryRaise() * 12;
        return yearlySalary;
    }
}
