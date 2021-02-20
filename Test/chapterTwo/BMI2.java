package chapterTwo;

import java.util.Scanner;

public class BMI2 {

    double weight;
    double height;
    double bodyMassIndex;
    String message;

    public BMI2(double weight, double height, double bodyMassIndex) {
        this.weight = weight;
        this.height = height;
        this.bodyMassIndex = bodyMassIndex;
    }

    public BMI2(){}

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getBodyMassIndex() {
        bodyMassIndex = weight / (height * height) ;
        System.out.printf("bodyMassIndex is %.2f %n", bodyMassIndex);
        return bodyMassIndex;
    }
    public void setBodyMassIndex(double bodyMassIndex) {
        this.bodyMassIndex = bodyMassIndex;
    }

    public double getWeightHeightAndBodyMassIndexFromUser(){
        Scanner input = new Scanner(System.in);

        System.out.println ("Enter Weight in Kilograms:");
        weight = input.nextDouble();

        System.out.println ("Enter height in meters:");
        height = input.nextDouble();

        bodyMassIndex = weight / (height * height)  ;
        System.out.printf("bodyMassIndex is %.2f %n", bodyMassIndex);

        return bodyMassIndex;
    }



    public String checkIfUnderWeight(){
        message = "You are Underweight";
        if (bodyMassIndex < 18.5) {
            System.out.println (message);
        }
        return message;
    }

    public String checkIfNormal(){
        message = "You are Normal";
        if (bodyMassIndex >= 18.5 && bodyMassIndex <= 24.9) {
            System.out.println (message);
        }
        return message;
        }

    public String checkIfOverWeight(){
        message = "You are Overweight";
        if (bodyMassIndex > 25 && bodyMassIndex <= 29.9) {
            System.out.println (message);
        }
        return message;
    }

    public String checkIfObese(){
        message = "You are Obese";
        if (bodyMassIndex >= 30) {
            System.out.println (message);
        }
        return  message;
    }







    public static void main(String... args){

        BMI2 bmi2 = new BMI2();
        bmi2.getWeightHeightAndBodyMassIndexFromUser();
        bmi2.checkIfNormal();
        bmi2.checkIfUnderWeight();
        bmi2.checkIfOverWeight();
        bmi2.checkIfObese();
    }
}
