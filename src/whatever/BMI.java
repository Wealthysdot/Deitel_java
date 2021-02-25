package whatever;

public class BMI {
    private double weight;
    private double height;
    private double BMIValue;
    private boolean isNegativeValueEntered;

    public BMI(double weight, double height, double BMIValue) {
        this.weight = weight;
        this.height = height;
        this.BMIValue = BMIValue;
    }

    public double getWeight() {
//        System.out.println("Enter weight in Kilogram:");
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        if(weight < 0){
            isNegativeValueEntered = true;
        }
        else{
            this.weight= weight;
            isNegativeValueEntered = false;
        }

    }

    public void setHeight(double height) {
        if (height < 0){
            isNegativeValueEntered = true;
        }
        else {
        this.height = height;
            isNegativeValueEntered = false;

        }
    }

    public double calculatingBMI() {
      double BMIValue =  getWeight() / (getHeight() * getHeight());
      this.BMIValue = BMIValue;
      return BMIValue;

    }

    public String checkBMIValue() {
        String message = " ";

        String bmiString = String.format("%.2f", BMIValue);
        BMIValue = Double.parseDouble(bmiString);

        if (BMIValue < 18.5 ){
            message = "Your BMI is " + BMIValue + "You are underweight";
        }
        else
            if (BMIValue > 18.5 && BMIValue < 25){
                message = "Your BMI is " + BMIValue + "You are normal";
            }
            else
                if(BMIValue > 25 && BMIValue < 30){
                    message = "Your BMI is" +" "+ BMIValue +" "+ "You are Overweight";
                }
                else
                    if(BMIValue > 30){
                        message = "Your BMI is " + BMIValue + "You are Obese";
                    }

                    return message;

    }



    public boolean isNegativeValueEntered() {
        return isNegativeValueEntered;
    }

    public String getInputErrorMessage() {
        String messageToReturn = "";
        if (isNegativeValueEntered == true){
            messageToReturn = "Please enter a positive number";
        }
        return messageToReturn;
    }
}


