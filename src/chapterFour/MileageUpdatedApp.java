//package chapterFour;
//
//import chapterThree.HeartRatesUpdated;
//
//import java.util.Scanner;
//
//public class MileageUpdatedApp {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//
//
//
//
//
//
//        int counter = 0;
//        trip.setCounter(counter);
//
//
//        System.out.println("Enter miles driven or -1 to end input");
//        double enterMiles = input.nextDouble();
//        trip.setMiles(enterMiles);
//
//        System.out.println("Enter gallons used or -1 to end input");
//        double enterGallon = input.nextDouble();
//        trip.setGallon(enterGallon);
//
//        while(enterMiles != -1 && enterGallon != -1){
//            counter = counter + 1;
//            System.out.println("Enter miles driven or -1 to end input");
//            enterMiles = input.nextDouble();
//            System.out.println("Enter gallons used or -1 to end input");
//            enterGallon = input.nextDouble();
//            miles = miles + enterMiles;
//            gallon = gallon + enterGallon;
//
//        }
//
//        if (counter != 0) {
//            trip.movement();
//            System.out.println("You went on" + " " + counter + " " + "trip(s)");
//            System.out.println("Miles per gallon of the trip is" + " " + trip.movement());
//        }
//
//    }
//}
