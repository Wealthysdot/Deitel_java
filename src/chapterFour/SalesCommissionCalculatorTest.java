package chapterFour;

import java.util.Scanner;

public class SalesCommissionCalculatorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        SalesCommissionCalculator realSales = new SalesCommissionCalculator();



        int counter = 0;

        System.out.println("Input value or -1 to end input");
        double  enterValue = input.nextDouble();
        realSales.setValue(enterValue);


        while (  enterValue != -1) {
            counter= counter + 1;
            System.out.println("Input value or -1 to end input");
            enterValue = input.nextDouble();

        }
//
        if ( enterValue != 0) {
            realSales.setPay();
            System.out.println("You made" + " " + counter + " "+ "sales");
            System.out.println("Your total amount of sales is" + realSales.getValue());
            System.out.println("Your commission is" + " " + realSales.getPay());

        }


    }
}







