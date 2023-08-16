package corejava.sba;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        //required
        Sedan sedan1 = new Sedan(100, 20_000, "White", 25);
        Ford ford1 = new Ford(120, 25_000, "Black", 2022, 500);
        Ford ford2 = new Ford(130, 30_000, "Grey", 2023, 1000);
        Car car = new Car(150, 35_000, "Blue");

        //bonus to test out other features
        Truck truck1 = new Truck(125, 45_000, "Charcoal", 5000);
        Truck truck2 = new Truck(125, 40_000, "Carbon", 1500);
        Sedan sedan2 = new Sedan(100, 15_000, "Pearl", 15);

        //required
        System.out.println("For the " + sedan1.length + "ft long " + sedan1.color + " Sedan, Sales Price: " + sedan1.getSalePrice() + ". Retail Price: " + sedan1.regularPrice);
        System.out.println("For the " + ford1.year + " " + ford1.color + " Ford, Sales Price: " + ford1.getSalesPrice() + ". Retail Price: " + ford1.regularPrice + ". Mfg Discount: " + ford1.manufacturerDiscount + " off.");
        System.out.println("For the " + ford2.year + " " + ford2.color + " Ford, Sales Price: " + ford2.getSalesPrice() + ". Retail Price: " + ford2.regularPrice + ". Mfg Discount: " + ford2.manufacturerDiscount + " off.");
        System.out.println("For the " + car.color + " " + car.speed + " mph car. No Sales Offer.  Retail Price: " + car.getSalesPrice());

        //bonus to test out other features
        System.out.println("Bonus Deals");
        System.out.println("For the " + truck1.color + " truck, weighing: " + truck1.weight + " lbs. Sales price: " + truck1.getSalesPrice() + " Retail Price: " + truck1.regularPrice );
        System.out.println("For the " + truck2.color + " truck, weighing: " + truck2.weight + " lbs. Sales price: " + truck2.getSalesPrice() + " Retail Price: " + truck2.regularPrice );
        System.out.println("For the " + sedan2.length + "ft long " + sedan2.color + " Sedan, Sales Price: " + sedan2.getSalePrice() + ". Retail Price: " + sedan2.regularPrice);
    }
}
