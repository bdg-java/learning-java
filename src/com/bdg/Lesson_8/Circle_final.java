package com.bdg.Lesson_8;

public class Circle_final {
    private double radius = 1.0;
    private String color = "red";

    public Circle_final() {

    }

    public Circle_final(double radius) {
        this.radius = radius;
    }

    public Circle_final(double radius, String color) {
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

    public String toString() {
        return (" Radius :" +radius+ "Color : "+ color);
    }
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
