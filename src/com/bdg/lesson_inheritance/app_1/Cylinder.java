package com.bdg.lesson_inheritance.app_1;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {}

    public Cylinder(double radius) {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return getArea()*height;
    }

    public static void main(String[] args) {
        Circle circle = new Circle(1.1, "blue");
        Cylinder cyl = new Cylinder(1.2, 1.3, "green");
        System.out.println(cyl.getVolume());
        System.out.println(circle.getArea());
        System.out.println(circle);
    }
}
