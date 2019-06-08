package com.bdg.inheritance;

public class Circle extends Shape {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public Circle(double radius) {

        this.radius = radius;

    }

    private Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }


    public static Circle getInstance(double radius, String color, boolean filled) {
        if (radius > 0) {
            return new Circle(radius, color, filled);
        }
        return null;
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
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle[radius=" + radius + "shapeColor: " + getColor() + "shapeFilled: " + isFilled()
                + "]";
    }
}
