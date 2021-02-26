package chapterThree;

import java.util.Scanner;

public class EmployeeUpdatedApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Please Enter Employees First Name:");
        String firstName = input.nextLine();

        System.out.println("Please Enter Employees  Last Name:");
        String lastName = input.nextLine();


        System.out.println("Please Enter Employees Salary");
        double salary = input.nextDouble();


        EmployeeUpdated Employee =  new EmployeeUpdated(firstName,lastName, salary);

        System.out.println("First Name:" +" "+ Employee.getFirstName() +" "+ Employee.getLastName());
        System.out.println("Salary" +" "+ Employee.getSalary());
        System.out.println("Employee has been given a raise" +" "+ Employee.calcSalaryRaise());
        System.out.println("Employee yearly salary is" +" "+ Employee.calcYearlyIncome());


    }
}
