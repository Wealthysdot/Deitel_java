package extraExercise;

import java.util.Scanner;

public class ArrayTesting {
    public static void main(String[] args) {
        int [] number = new int [10];
        number [0] = 17;
        number [1] = 20;
        number [2] = 10;
        number [3] = 24;
        number [4] = 13;
        number [5] = 32;
        number [6] = 24;
        number [7] = 13;
        number [8] = 32;
        number [9] = 24;

//        print a location
        System.out.println(number[5]);

//        print the length of the array
        System.out.println(number.length);

//         to print the whole thing in the array, you use a for loop
        int min  = number[0]; // to take in min value(u are initializing to number[0] so to just assign str
        int total = 0; //used to make total of the numbers in the loop
        for(int i = 0; i < number.length; i++) {
            total = total + number[i];
            if(min > number[i]){
                min = number[i];
            }
            System.out.print(number[i] + " ");
        }

//         this is printing outside the loop, because u are saying, after counting the loop o, sum it
        System.out.println();
        System.out.println(total);
        System.out.println(min);


        Scanner input = new Scanner(System.in);
        int []scores = new int [5];

//        public void printArrayElement(0){
//            for (int index = 0; index < scores.length; index++) {
//
//                System.out.print("Enter Value " + (index + 1) + " :");
//                scores[index] = input.nextInt();
//            }
//            System.out.println(scores[3]);
//        }
        }
    }




