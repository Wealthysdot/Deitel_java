package chapterSix;

public class EvenOrOdd {

    private int num;

    public EvenOrOdd(int num) {
        this.num = num;
    }

    public int getEven() {
        if(num % 2 == 0)
            System.out.println(true);
        else
            System.out.println(false);

        return num;
    }
}
