package com.bdg.Lesson_9.Shape;

public class Rectangle extends Shape {

    protected double length = 1;
    protected double width = 1;

    public Rectangle() {

    }

    public Rectangle(double width, double lenght) {
        this.length = lenght;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.length = lenght;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Width: " + width + "Length: " + length;
    }
}
