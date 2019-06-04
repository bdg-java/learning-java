package com.bdg.Lesson_8;

public class Rectangle {
    private float length;
    private float width;

    public Rectangle() {

    }

    public Rectangle(float length, float width) {
        this.width = width;
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        double Area = this.length * this.width;
        return Area;
    }

    public double getPerimeter() {
        double perimeter = 2 * (this.length + this.width);
        return perimeter;
    }

    public String toString() {
        return ("Length : " + length + "Width : " + width);
    }
}
