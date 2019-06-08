package com.bdg.inheritance;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return radius * radius * Math.PI;
    }
}
