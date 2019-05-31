package com.lesson7;

public class Rectangle {
    private float length = 1.0f; // <-- MB use here default instance field values?

    private float width = 1.0f;


    //I think we should remove this constructor to prevent object creation without parameters.
    public Rectangle() {
    }

    private Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public static Rectangle createRectangle(float length, float width) {
        if (length <= 0 || width <= 0)
            return null;
        else return new Rectangle(length, width);
    }

    public float getLength() {
        return this.length;
    }

    public void setLength(float length) {
        if (length <= 0)
            System.out.println("Length is not valid........");
        else this.length = length;
    }

    public float getWidth() {
        return this.width;
    }

    public void setWidth(float width) {
        if (width <= 0)
            System.out.println("Width is not valid........");
        else this.width = width;
    }

    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }


    public String toString() {
        return "Length: " + this.length + " Width: " + this.width;
    }
}
