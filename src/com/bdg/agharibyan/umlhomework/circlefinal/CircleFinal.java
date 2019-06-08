package com.bdg.agharibyan.umlhomework.circlefinal;


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

    public String toString() {

        return ("circle[radius=" + this.radius + ", color=" + this.color + "]");
    }

    public double getArea() {
        double Area = Math.PI * Math.pow(this.radius, 2);
        return Area;
    }
}
