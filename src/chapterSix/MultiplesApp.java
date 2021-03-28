package chapterSix;

import java.util.Scanner;

public class MultiplesApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int firstNum= input.nextInt();

        System.out.println("Enter a second number");
        int secondNum= input.nextInt();

        Multiples Multiples = new Multiples(firstNum, secondNum);
        Multiples.calcMultiples();

    }

}
