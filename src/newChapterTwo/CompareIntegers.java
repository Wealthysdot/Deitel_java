package chapterTwo;

import java.util.Scanner;

public class CompareIntegers{
    public static void main(String []args){

        int a;
        int b;
        Scanner input = new Scanner(System.in);

        System.out.println ("Enter first integer");
        a = input.nextInt();

        System.out.println ("Enter second integer");
        b = input.nextInt();

        if (a>b) {
            System.out.println(a + " is larger");
        }


        if (b > a){
            System.out.println(b + " is larger");
        }

        if (a==b){
            System.out.println("These numbers are equal");
        }


    }
}