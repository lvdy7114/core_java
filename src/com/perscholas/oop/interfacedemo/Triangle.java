package com.perscholas.oop.interfacedemo;

public class Triangle extends Shape implements Movable {
    private int x, y;
    protected double base;
    protected double height;

    public Triangle(int x, int y, double base, double height) {
        this.x = x;
        this.y = y;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String getCoordinate() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public void displayshapName() {
        System.out.println("Drawing a triangle with base " + base + " and height " + height);
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

