package com.bdg.classlessons;

public class Rectangle {

    private float length;
    private float width;

    private Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public static Rectangle createRectangle(float length, float width) {
        if (length <= 0 || width <= 0) {
            System.out.println("Invalid parameters");
            return null;
        }
        return new Rectangle(length, width);

    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle[length=" + length + "width=" + width + "]";
    }

}
