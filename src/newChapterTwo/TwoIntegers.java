package chapterTwo;

import java.util.Scanner;
public class TwoIntegers {
    public static void main(String[] args) {

        int num1;
        int num2;
        int sum;
        int diff;
        int prod;
        int quo;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter first integer");
        num1 = input.nextInt();

        System.out.println("Enter second integer");
        num2 = input.nextInt();



        sum = num1 + num2;
        System.out.printf("Sum is %d%n", sum);

        diff = num1 - num2;
        System.out.printf("Difference is %d%n ", diff);

        prod = num1 * num2;
        System.out.printf("Product is %d%n ", prod);

        quo = num1 / num2;
        System.out.printf("Quotient is %d%n ", quo);



    }
}

