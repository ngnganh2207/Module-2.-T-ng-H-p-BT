package com.company;

public class Circle extends Shape{
    private double radius;

    public Circle(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    public void draw() {
        System.out.println("Draw circle");
    }

    public void erase() {
        System.out.println("Erase circle");
    }
}
