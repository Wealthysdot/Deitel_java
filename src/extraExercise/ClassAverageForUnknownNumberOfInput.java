package extraExercise;

import java.util.Scanner;

//to check when the number of input is not specified
public class ClassAverageAgain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int total = 0;
        int counter = 0;
//        int sentinel = -1;

        System.out.println("Enter grade or -1 to end input");
        int grade = input.nextInt();

        while (grade != -1) {
            total = total + grade;
            counter = counter + 1;
            System.out.println("Enter grade");
            grade = input.nextInt();
        }

        if (counter != 0){
            int average = total / counter;
            System.out.println("Average is" + " " + average);
        }
        else
            System.out.println("No grades were entered");


    }
}
