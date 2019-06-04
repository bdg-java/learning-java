package com.bdg.lessonclasses;

public class Circle {
    private double radius = 1.0;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle[radius: " + this.radius + "]";
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(7);
        System.out.println(circle.getArea());
        System.out.println(circle1.getArea());
        System.out.println(circle.getCircumference());
    }
}
