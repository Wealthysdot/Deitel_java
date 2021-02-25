package chapterTwo;
import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Input Number");
        num = input.nextInt();

        if (num % 2 == 0)
            System.out.println("Number is Even");
        if (num % 2 != 0 )
            System.out.println( "Number is Odd");

    }
}
