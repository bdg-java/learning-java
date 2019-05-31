package com.bdg.classlessons;

public class CircleFinal {
    private double radius = 1.0;
    private String color = "red";

    public CircleFinal() {

    }

    public CircleFinal(double radius) {
        this.radius = radius;
    }

    public CircleFinal(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString()
    {
        return "Circle[radius=" + radius + ",color=" + color + "]";
    }

}
