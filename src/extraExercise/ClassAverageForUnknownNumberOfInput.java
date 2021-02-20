package extraExercise;

import java.util.Scanner;

//to check when the number of input is not specified
public class ClassAverageForUnknownNumberOfInput {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int  total = 0;
        int counter = 0;

        System.out.println("Enter grade or -1 to end input");
        int grade = input.nextInt();

        while (grade != -1) {
            total = total + grade;
            counter = counter + 1;
            System.out.println("Enter grade or -1 to end input");
            grade = input.nextInt();
        }

        if (counter != 0){
            double average = (double)total / counter;
            System.out.println("The total number of grades entered is" +" "+ counter);
            System.out.println("Total sum of grades entered are" +" "+ total);
            System.out.println("The average of the grades entered is" +" "+ average);


        }
        else
            System.out.println("No grades were entered");


    }
}
