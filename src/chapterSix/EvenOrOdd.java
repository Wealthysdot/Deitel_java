package chapterSix;

public class EvenOrOdd {

    private int num;

    public EvenOrOdd(int num) {
        this.num = num;
    }

    public boolean getEven() {
        if(num % 2 == 0){
            return true;
        }
        else
            return false;


    }

    public void setNumber(int num) {
        this.num = num;
    }

    public int getNumber() {
        return num;
    }
}
