package com.lesson7;

public class CircleImplementation {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(5.0);
        System.out.println("GetRadius of Circle c1 : " + c1.getRadius());
        c1.setRadius(-5);
        c1.setRadius(2);
        System.out.println("GetRadius of Circle c1 : " + c1.getRadius());
        System.out.println("GetRadius of Circle c2 : " + c2.getRadius());
        System.out.println("GetArea of Circle c1 : " + c1.getArea());
        System.out.println("GetCircumference of Circle c2 : " + c2.getCircumference());
        System.out.println("Override ToString method for c2: " + c2);
    }
}
