package chapterThree;

import java.util.Scanner;

public class DateTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("input month");
        int month = input.nextInt();

        System.out.println("input day");
        int day = input.nextInt();

        System.out.println("input year");
        int year = input.nextInt();

        Date dateTest = new Date(month, day, year);

        dateTest.getDisplayDate();

    }
}
