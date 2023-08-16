package com.perscholas.oop.polymorphism;

public class myRunner {
    public static void main(String[] args) {
        Circle c = new Circle(100);
        System.out.println("Area of Circle " + c.getArea());
// Example of Object type casting
// declaration of object variable obj of the Shape class
// Shape sObj ; // object creation of the Shape class
        Shape sObj = new Shape();
        sObj.displayShapeName();
        System.out.println(sObj instanceof Shape); // true
// object creation of the Circle class
        System.out.println("+++++++++");
// it’s fine because a Circle is a Shape by inheritance
        Shape shapeCircleObj = new Circle(100); // UpCasting
        shapeCircleObj.displayShapeName();
        System.out.println("Area of Circle " + shapeCircleObj.getArea());
        System.out.println(shapeCircleObj); // Run circle's toString()
// Use instanceof operator for Validation
        System.out.println(shapeCircleObj instanceof Circle); // true
        System.out.println(sObj instanceof Circle); // false because Shape is not a Circle
        System.out.println("--------------------");
        Shape shapeRectangleObj = new Rectangle("Red"); //UpCasting
        shapeRectangleObj.displayShapeName();
        shapeRectangleObj.setHeight(2);
        shapeRectangleObj.setWidth(2);
        System.out.println("Area of Rectangle is " + shapeRectangleObj.getArea());
        System.out.println(shapeRectangleObj); // Run Rectangle's toString()
// Use instanceof operator for Validation
        System.out.println(shapeRectangleObj instanceof Rectangle); // true
        System.out.println(sObj instanceof Rectangle); // false because Shape is not a Rectangle
        System.out.println("--------------------");
        Shape shapeTriangleObj = new Triangle("Blue"); //UpCasting
        shapeTriangleObj.displayShapeName();
        shapeTriangleObj.setHeight(2);
        shapeTriangleObj.setBase(3);
        System.out.println("Area of Triangle is " + shapeTriangleObj.getArea());
        System.out.println(shapeTriangleObj); // Run Triangle's toString()
// Use instanceof operator for Validation
        System.out.println(shapeTriangleObj instanceof Triangle); // true
        System.out.println(sObj instanceof Triangle); // false because Shape is not a Triangle
        System.out.println("--------------------");
        Cylinder cylinderShape = new Cylinder(3); //UpCasting
        cylinderShape.displayShapeName();
        cylinderShape.setHeight(3);
        System.out.println("Area of Cylinder is " + cylinderShape.getVolumne());
        System.out.println(cylinderShape); // Run cylinderShape's toString()
    }
}

//output
//Area of Circle 31415.926535897932
//I am a Shape.
//true
//+++++++++
//Drawing a Circle of radius 100.0
//Area of Circle 31415.926535897932
//Circle[ radius = 100.0Shape[color=null]]
//true
//false
//--------------------
//I am a Rectangle
//Area of Rectangle is 4.0
//Rectangle[height=2.0,width=2.0,Shape[color=Red]]
//true
//false
//--------------------
//I am a TriAngle
//Area of Triangle is 3.0
//Triangle[base=3.0,height=2.0,Shape[color=Blue]]
//true
//false
//--------------------
//Drawing a Cylinder for radius 3.0
//Area of Cylinder is 84.82300164692441
//radius is: 3.0height is : 3.0

//● In the above example, we have created objects of the Shape class: sObj,
//shapeCircleObj, shapeRectangleObj, and shapeTriangleObj. These objects are
//polymorphic variables.
//● We can summarize this by stating that Superclass reference variables are
//polymorphic reference variables. They can refer to objects of their own class or
//objects of the subclasses inherited from their class.
//● The instanceof operator is a Boolean operator that tests whether an object
//belongs to a given class.