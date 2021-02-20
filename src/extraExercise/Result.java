package extraExercise;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counterFail = 0;
        int counterPass = 0;
        int studentCounter = 1;


        while (studentCounter <= 10) {
            System.out.println("Enter Result, 1 for Pass, 2 for fail");
            int enter = input.nextInt();

            if (enter == 1) {
                counterPass++ ;
            }
            else
                counterFail ++;

            studentCounter ++;

        }
        System.out.println("Number of pass is" + " " + counterPass);
        System.out.println("Number of fail is" + " " + counterFail);

        if (counterPass > 8 ){
            System.out.println("Bonus to Instructor");

    }



    }

}

