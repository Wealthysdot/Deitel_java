package chapterFive;



public class ProductOfOddIntegers {
    public static void main(String[] args) {

       int product = 1;
       for (int x = 3; x <= 15; x+= 2)
           product *= x;
            System.out.println(product);
    }
    }

