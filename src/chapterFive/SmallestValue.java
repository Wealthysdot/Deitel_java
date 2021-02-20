package chapterFive;

public class SmallestValue {
    private int digit;
//    private boolean isNegativeValueEntered;

    public SmallestValue(int digit) {
        this.digit = digit;
    }

    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

////to check for negative number
//    public void setDigit(int digit) {
//        if(digit < 0){
//            isNegativeValueEntered = true;
//        }
//        else {
//            this.digit = digit;
//        }
//        }
////    to check for negative
//    public boolean isNegativeValueEntered() {
//        return isNegativeValueEntered;
//    }
//
//    public String getInputErrorMessage() {
//        String messageToReturn = "";
//        if (isNegativeValueEntered == true){
//            messageToReturn = "Please enter a positive number";
//        }
//        return messageToReturn;
//
//    }


}
