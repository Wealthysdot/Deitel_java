package whatever;

import java.util.Scanner;


public class BMIApp {
    public static void main(String[] args) {
        whatever.BMI newBMI = new whatever.BMI(0.0,0.0, 0);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kilogram:");
        double weight = input.nextDouble();
        newBMI.setWeight(weight);
        while(newBMI.isNegativeValueEntered()) {
            System.out.println(newBMI.getInputErrorMessage());
            System.out.println("Enter weight in kilogram:");
            weight = input.nextDouble();
            newBMI.setWeight(weight);
        }


        System.out.println("Enter height in meters:");
        double height = input.nextDouble();
        newBMI.setHeight(height);
        while(newBMI.isNegativeValueEntered()) {
            System.out.println(newBMI.getInputErrorMessage());
            System.out.println("Enter height in meters:");
            height = input.nextDouble();
            newBMI.setHeight(height);
        }
            newBMI.calculatingBMI();
            System.out.println(newBMI.checkBMIValue());





    }
}
