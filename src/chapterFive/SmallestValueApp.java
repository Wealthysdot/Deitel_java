package chapterFive;

import java.util.Scanner;

public class SmallestValueApp {
    public static void main(String[] args) {
        SmallestValue newSmallestValue = new SmallestValue(0);


        Scanner input = new Scanner(System.in);
        int smallest = 0;
        int number;
        int integers;

        System.out.print("Enter number of integers: ");
        integers = input.nextInt();

        for (int counter = 1; counter <= integers; counter++) {
            System.out.print("Enter integer: ");
            number = input.nextInt();

            if (counter == 1)
                smallest = number;
            else if (number < smallest)
                smallest = number;
        }
        System.out.printf( "Smallest Integer is: %d\n", smallest );



    }
}







