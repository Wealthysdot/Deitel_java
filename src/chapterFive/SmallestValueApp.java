package chapterFive;

import java.util.Scanner;

public class SmallestValueApp {
    public static void main(String[] args) {
        SmallestValue newSmallestValue = new SmallestValue(0);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Digit: ");
        int digit = input.nextInt();
//        newSmallestValue.setDigit(digit);
        System.out.println(digit);
//        System.out.println(newSmallestValue.getInputErrorMessage());

    }

}
