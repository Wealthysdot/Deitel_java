package chapterFour;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 1;
        System.out.println("Enter your number of unit sold");
        int number = input.nextInt();
        int largest =  number;
        counter++;
        while (counter <= 10){
            System.out.println("Enter your number of unit sold");
            number = input.nextInt();
            counter++;

            if (number > largest){
                largest = number;
                System.out.println(counter +" " + "people entered their sold unit");
                System.out.println("Winner is the salesperson that entered" + " " + largest);

            }
        }









    }
    }

