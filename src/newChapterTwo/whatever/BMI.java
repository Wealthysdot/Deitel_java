package chapterTwo.whatever;

import java.util.Scanner;

public class BMI{
    public static void main(String []args){
        double weight;
        double height;
        double bodyMassIndex;

        Scanner input = new Scanner(System.in);

        System.out.println ("Enter Weight in Kilograms");
        weight = input.nextDouble();

        System.out.println ("Enter height in meters");
        height = input.nextDouble();

        bodyMassIndex = weight / (height * height);
        System.out.printf("bodyMassIndex is %.2f %n", bodyMassIndex);

        if (bodyMassIndex < 18.5) {
            System.out.println ("You are Underweight");
        }

        if (bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9) {
            System.out.println ("You are Normal");
        }

        if (bodyMassIndex > 25 && bodyMassIndex <= 29.9) {
            System.out.println ("You are Overweight");
        }

        if (bodyMassIndex >= 30) {
            System.out.println ("You are Obese");
        }


    }
}
