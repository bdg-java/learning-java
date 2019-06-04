package com.bdg.Lesson_8;

public class Circle {
    private double radius = 1.0;

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return (" Radius :" + radius);
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        double Circumference = 2 * Math.PI * this.radius;
        return Circumference;
    }
}
