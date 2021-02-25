package chapterTwo;



import java.util.Scanner;
public class ArithmeticSmallAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int average;
        int product;
        int smallest;
        int largest;
        int a, b, c;
        int temp = 0;

        System.out.println("Input First Integer");
        a = input.nextInt();
        temp = a;

        System.out.println("Input Second Integer");
        b = input.nextInt();

        System.out.println("Input Third Integer");
        c = input.nextInt();


        if (a <= b)


        sum = a + b + c;
        average = sum / 3;
        product = a*b*c;


        System.out.printf("Sum is %d%n", sum);
        System.out.printf("Product is %d%n ", product);
        System.out.printf("Average is %d ", average);






    }





}
