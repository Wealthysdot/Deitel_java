package chapterSix;

public class Multiples {

    private int firstNum;
    private int secondNum;

    public Multiples(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public int getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public boolean calcMultiples() {
        if (firstNum % secondNum == 0) {
            return true;
        } else
            return false ;

    }

}
