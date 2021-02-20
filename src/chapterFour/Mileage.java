package chapterFour;

public class Mileage {
    private double miles;
    private double gallon;
    private int counter = 0;

    public Mileage(double miles, double gallon, int counter) {
        this.miles = miles;
        this.gallon = gallon;
        this.counter = counter;
    }

//    public Mileage() {
//
//    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }

    public double getGallon() {
        return gallon;
    }

    public void setGallon(double gallon) {
        this.gallon = gallon;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public double movement(){
        double movement = miles / gallon;
        return movement;
    }
}
