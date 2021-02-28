package chapterFour;

public class MileageUpdated {
    private double gallon;
    private double miles;
    private boolean isNegativeValueInput;

    public MileageUpdated(double gallon, double miles) {
        this.gallon = gallon;
        this.miles = miles;
    }

    public double getGallon() {
        return gallon ;
    }

    public void setGallon(double gallon) {
        if(gallon < 0){
            isNegativeValueInput = true;

        }else{
        this.gallon = gallon;
        }
    }

    public double getMiles() {
        return miles;
    }

    public void setMiles(double miles) {
        if(miles < 0){
            isNegativeValueInput = true;
        }else {
            this.miles = miles;
        }
    }

    public boolean isNegativeValueInput() {
    return  isNegativeValueInput;

    }

    public String getErrorMessage() {
        String message = " ";
        if(isNegativeValueInput = true){
            message = "Negative number entered";
        }
        return message;
    }

    public double calculateMileage() {
        double mileage = miles/gallon;
        return mileage;
    }


}
