package chapterFive;

public class Factorial {
    private long num;
    private boolean isNegativeValueEntered;
    private long total=1;

    public long getTotal() {
        return total;
    }

    public Factorial() {
    }

    public Factorial(long num) {
        this.num = num;
    }

    public void setNum(long num) {
        if (num < 0) {
                isNegativeValueEntered=true;
        } else {
            this.num = num;
        }

    }

    public long getNum() {
        return num;
    }

    public boolean isNegativeValueEntered() {
        return isNegativeValueEntered;
    }

    public String getInputErrorMessage() {
        String messageToReturn = " ";
        if (isNegativeValueEntered = true) {
            messageToReturn = "Invalid Entry, Enter a positive number";
        }
        return messageToReturn;
    }

    public void calcFactorial(){
        for (int counter = 1; counter <= num; counter++ ){
            total = total * counter;
        }


    }
}