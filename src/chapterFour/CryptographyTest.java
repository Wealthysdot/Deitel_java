package chapterFour;

import java.util.Scanner;

public class CryptographyTest {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Cryptography crypt = new Cryptography();

        System.out.println("Enter four digit number");
        int theDigit = input.nextInt();
        crypt.setDigit(theDigit);



        System.out.println(crypt.getOneNumberFromDigit());
        System.out.println(crypt.getTwoNumberFromDigit());
        System.out.println(crypt.getDivToMakeDigitThreeNumbers());
        System.out.println(crypt.getDigit());
        System.out.println();
        System.out.println(crypt.getOneNumberFromDigit());
        System.out.println(crypt.getRemToGetSecondNumber());
        System.out.println(crypt.getRemToGetThirdNumber());
        System.out.println(crypt.getRemToGetFourthNumberFromDigit());
        System.out.println();
        System.out.print(crypt.getFirstNumberToEncrypt());
        System.out.print(crypt.getSecondNumberToEncrypt());
        System.out.print(crypt.getThirdNumberToEncrypt());
        System.out.print(crypt.getTheFourthNumberToEncrypt());
        System.out.println();
        crypt.getEncrypt();
    }

}
