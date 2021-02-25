package chapterTwo;
import java.util.Scanner;
public class NegativePositiveAndZeroValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;
        int num5 = 0;
        int counterNegative = 0;
        int counterPositive = 0;
        int counterZero = 0;

        System.out.println("Enter First Integer");
        num1 = input.nextInt();
           if (num1 < 0) {
               counterNegative = counterNegative + 1;
           }
           if (num1 > 0) {
               counterPositive = counterPositive + 1;
           }

           if (num1 == 0) {
               counterZero = counterZero + 1;
           }

        System.out.println("Enter Second Integer");
            num2 = input.nextInt();
            if (num2 < 0) {
                counterNegative = counterNegative + 1;
            }
            if (num2 > 0) {
                counterPositive = counterPositive + 1;
            }

            if (num2 == 0) {
                counterZero = counterZero + 1;
            }

        System.out.println("Enter Third Integer");
            num3 = input.nextInt();
            if (num3 < 0) {
                counterNegative = counterNegative + 1;
            }
            if (num3 > 0) {
                counterPositive = counterPositive + 1;
            }

            if (num3 == 0) {
                counterZero = counterZero + 1;
            }


        System.out.println("Enter Fourth Integer");
            num4 = input.nextInt();
            if (num4 < 0) {
                counterNegative = counterNegative + 1;
            }
            if (num4 > 0) {
                counterPositive = counterPositive + 1;
            }

            if (num4 == 0) {
                counterZero = counterZero + 1;
            }


        System.out.println("Enter Fifth Integer");
            num5 = input.nextInt();

            if (num5 < 0) {
                counterNegative = counterNegative + 1;
            }
            if (num5 > 0) {
                counterPositive = counterPositive + 1;
            }

            if (num5 == 0) {
                counterZero = counterZero + 1;
            }


        System.out.printf("Number of Positive integer are %d%n", counterPositive);
        System.out.printf("Number of Negative integer are %d%n", counterNegative);
        System.out.printf("Number of Zero integer are %d%n", counterZero);



    }
}
