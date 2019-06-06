package com.bdg.Inheritance.CircleCylinder;

public class Circle {
    protected double radious = 1;
    protected   String color = "red";

    public Circle() {
    }

    public Circle(double radious) {
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(double radious, String color) {
        this.radious = radious;
        this.color = color;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radious,2);
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radious=" + radious +
                ", color='" + color + '\'' +
                ']';
    }
}
