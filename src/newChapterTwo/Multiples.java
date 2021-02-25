package chapterTwo;
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;

        Scanner input = new Scanner (System.in);
        System.out.println("Input First Number");
        firstNumber = input.nextInt();

        System.out.println("Input Second Number");
        secondNumber = input.nextInt();

        if (firstNumber % secondNumber == 0)
            System.out.println(firstNumber +  " is a multiple of " + secondNumber);

        if (firstNumber % secondNumber != 0)
            System.out.println(firstNumber +  " is not a multiple of " + secondNumber);



    }




}
