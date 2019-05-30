package com.lesson7;

public class Circle {
    private double radius = 1;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        if (radius < 0)
            System.out.println("Radius is not valid ...");
        else this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getCircumference() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Radius of circle: " + this.radius;
    }
}
