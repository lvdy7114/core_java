package corejava.sba;

public class Sedan extends Car {
    int length;

    public Sedan(int speed, double RegularPrice, String color, int length) {
        super(speed, RegularPrice, color);
        this.length = length;
    }
    public double getSalePrice() {
        if (length > 20) {
            return regularPrice - (regularPrice * .05d) ;
        } else {
            return regularPrice - (regularPrice * .10d);
        }
    }
}
