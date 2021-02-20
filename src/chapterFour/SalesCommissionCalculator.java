package chapterFour;

public class SalesCommissionCalculator {

    private int item;
    private double value;
    private double pay;

    public SalesCommissionCalculator(int item, double value, double pay) {
        this.item = item;
        this.value = value;
        this.pay = pay;
    }

    public SalesCommissionCalculator() {

    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {

        this.value = value;
    }

    public double getPay() {

        return pay;
    }

    public void setPay() {
        pay = 200+ ((9 * value) / 100);

    }


}

