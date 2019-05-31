package com.lesson7;

public class CirclewithColor {
    double radius = 1.0;
    String color = "red";

    public CirclewithColor() {

    }

    public CirclewithColor(double radius) {
        this.radius = radius;
    }

    public CirclewithColor(double radius, String color) {
        this(radius);
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public String toString() {
        return "CirclewithColor: " + this.radius + ", " + this.color;
    }
}
