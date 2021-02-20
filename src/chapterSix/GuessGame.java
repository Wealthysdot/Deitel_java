package chapterSix;

import java.util.Scanner;
import java.util.Random;
//import java.security.SecureRandom;
public class GuessGame {
    public static void main(String[] args) {
        Random num = new Random();
        Scanner input = new Scanner(System.in);


//            GuessTheNumber gameTest = new GuessTheNumber();

         int i = 0;
        while (i != 1){
            int gameTest = num.nextInt(11);
            System.out.println(gameTest);
            System.out.println("Guess the Number between 1 and 10");
            int userInput = input.nextInt();
            if (gameTest < userInput){
                System.out.println("Number too low, Try again");
            }
            else if (gameTest > userInput){
                System.out.println("Number too high, Try again");
            }

            else {
                System.out.println("Congratulation");
            }

            System.out.println("Next guess to try again or type 11 to end");
            int enter = input.nextInt();
            if (enter == 11 ){
                System.out.println("Game Ended");
                break;
            }



        }



//





    }
}
