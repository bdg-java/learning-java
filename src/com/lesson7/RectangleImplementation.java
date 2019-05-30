package com.lesson7;

public class RectangleImplementation {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = Rectangle.createRectangle(-5, 3);
        Rectangle r3 = Rectangle.createRectangle(3, 5);
        r1.setLength(5);
        r3.setLength(-5);
        r3.setLength(4);
        r3.setWidth(2);
        System.out.println("Print length of r1: " + r1.getLength());
        System.out.println("Print length and width of r3: " + r3.getLength() + " " + r3.getWidth());
        System.out.println("Print Area of r1: " + r1.getArea());
        System.out.println("Print Perimeter of r3: " + r3.getPerimeter());
        System.out.println("Override ToString method for r1: " + r1);
        System.out.println("Override ToString method for r3: " + r3);


    }
}
