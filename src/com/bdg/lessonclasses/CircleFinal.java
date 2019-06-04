package com.bdg.lessonclasses;

public class CircleFinal {
    private double radius = 1.0;
    private String color = "red";

    public CircleFinal() {}

    public CircleFinal(double radius) {
        this.radius = radius;
    }

    public CircleFinal(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle[radius: " + this.radius + ", color: " + this.color + "]";
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {
        CircleFinal circle = new CircleFinal();
        CircleFinal circle1 = new CircleFinal(7);
        System.out.println(circle.getArea());
        System.out.println(circle1.getArea());
    }
}
