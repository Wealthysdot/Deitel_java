package chapterSix;



import java.util.Scanner;

public class EvenOrOddApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = input.nextInt();

            EvenOrOdd EvenOrOdd = new EvenOrOdd(num);
            EvenOrOdd.getEven();
        }
    }

