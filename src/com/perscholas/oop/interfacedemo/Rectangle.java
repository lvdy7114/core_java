package com.perscholas.oop.interfacedemo;

public class Rectangle extends Shape implements Movable {
    private int x, y;
    protected double length;
    protected double width;

    public Rectangle(int x, int y, double length, double width) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public String getCoordinate() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public void displayshapName() {
        System.out.println("Drawing a rectangle with length " + length + " and width " + width);
    }

    @Override
    public void moveUp() {
        y--;
    }

    @Override
    public void moveDown() {
        y++;
    }

    @Override
    public void moveLeft() {
        x--;
    }

    @Override
    public void moveRight() {
        x++;
    }
}


