package chapterFour;

public class MileageUpdated {
    private double gallon;
    private double miles;

    public MileageUpdated(double gallon, double miles) {
        this.gallon = gallon;
        this.miles = miles;
    }

    public double getGallon() {
        return gallon ;
    }

    public void setGallon(double gallon) {
        this.gallon = gallon;
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        this.miles = miles;
    }
}
