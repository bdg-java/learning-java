package com.bdg.Lesson_9.Shape;

public class Circle extends Shape {
    private double radius = 1.0;


    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * (Math.PI * this.radius);
    }

    @Override
    public String toString() {
        return "Radius: " +radius;
    }
}

