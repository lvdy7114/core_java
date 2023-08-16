package com.perscholas.oop.interfacedemo;

public class myRunner {
public static void main(String[] args){
        Circle c1=new Circle(1,2,2);
        System.out.println("Area of Circle "+c1.getArea());
        System.out.println("Coordinates are "+c1.getCoordinate());
        c1.moveDown();
        System.out.println("After move Down, Coordinates are "+c1.getCoordinate());
        c1.moveRight();
        System.out.println("After move right, Coordinates are "+c1.getCoordinate());
        c1.moveUp();
        System.out.println("After move Up, Coordinates are "+c1.getCoordinate());
        c1.moveLeft();
        System.out.println("After move left, Coordinates are "+c1.getCoordinate());
        System.out.println("--------Test Polymorphism-------");
        Movable c2=new Circle(5,10,200); // upcast
        c2.moveUp();
        System.out.println("After move up , Coordinates are "+c2.getCoordinate());
        c2.moveLeft();
        System.out.println("After move Left , Coordinates are "+c2.getCoordinate());

        Rectangle rectangle = new Rectangle(3, 4, 5, 6);
        System.out.println("Area of Rectangle "+rectangle.getArea());
        System.out.println("Coordinates are "+rectangle.getCoordinate());
        c1.moveDown();
        System.out.println("After move Down, Coordinates are "+rectangle.getCoordinate());
        c1.moveRight();
        System.out.println("After move right, Coordinates are "+rectangle.getCoordinate());
        c1.moveUp();
        System.out.println("After move Up, Coordinates are "+rectangle.getCoordinate());
        c1.moveLeft();
        System.out.println("After move left, Coordinates are "+rectangle.getCoordinate());

        Triangle triangle = new Triangle(7, 8, 9, 10);
        System.out.println("Area of Triangle "+triangle.getArea());
        System.out.println("Coordinates are "+triangle.getCoordinate());
        c1.moveDown();
        System.out.println("After move Down, Coordinates are "+triangle.getCoordinate());
        c1.moveRight();
        System.out.println("After move right, Coordinates are "+triangle.getCoordinate());
        c1.moveUp();
        System.out.println("After move Up, Coordinates are "+triangle.getCoordinate());
        c1.moveLeft();
        System.out.println("After move left, Coordinates are "+triangle.getCoordinate());
        }
}
//We can also upcast subclass instances to the Movable interface via
//Polymorphism, similar to an abstract class.

//output
//Area of Circle 12.566370614359172
//Coordinates are (1,2)
//After move Down, Coordinates are (1,3)
//After move right, Coordinates are (2,3)
//After move Up, Coordinates are (2,2)
//After move left, Coordinates are (1,2)
//--------Test Polymorphism-------
//After move up , Coordinates are (5,9)
//After move Left , Coordinates are (4,9)
//Area of Rectangle 30.0
//Coordinates are (3,4)
//After move Down, Coordinates are (3,4)
//After move right, Coordinates are (3,4)
//After move Up, Coordinates are (3,4)
//After move left, Coordinates are (3,4)
//Area of Triangle 45.0
//Coordinates are (7,8)
//After move Down, Coordinates are (7,8)
//After move right, Coordinates are (7,8)
//After move Up, Coordinates are (7,8)
//After move left, Coordinates are (7,8)