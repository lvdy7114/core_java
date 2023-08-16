package corejava.sba;

public class Truck extends Car {
    int weight;

    public Truck(int speed, double RegularPrice, String color, int weight) {
        super(speed, RegularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalesPrice() {
        if (weight > 2000) {
            return regularPrice - (regularPrice * .10d);
        } else {
            return regularPrice - (regularPrice * .20d);
        }
    }



}



