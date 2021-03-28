package chapterFive;

import java.util.Scanner;

public class FactorialApp {
       public static void main(String[] args) {
           Factorial factorial = new Factorial();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        int num = input.nextInt();
        while (num<0){
            factorial.setNum(num);
            System.out.println(factorial.getInputErrorMessage());
            num = input.nextInt();
        }
        factorial.setNum(num);
        factorial.calcFactorial();
        System.out.println(factorial.getTotal());
    }



}
