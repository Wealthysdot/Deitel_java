package extraExercise;

import java.util.Scanner;

public class ClassAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int counter = 0;


        while (counter <= 10) {
            System.out.println("Enter grade");
            int grade = input.nextInt();
            sum = sum + grade;
//            if (counter < 10){
                counter = counter + 1;

        }
        int number = counter - 1;

        int Average = sum / number;
        System.out.println("Total number of entered score is" + " " + number +" " + "Sum of score is" +" "+ sum +" "+ "and Average is" + " " + Average);
    }
}
