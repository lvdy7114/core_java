package corejava.sba;

public class Ford extends Car {
    int year;
    int manufacturerDiscount;

    public Ford (int speed, double RegularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, RegularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalesPrice() {
        return regularPrice - manufacturerDiscount;
    }

}
