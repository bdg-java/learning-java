package com.bdg.Lesson_12.Geometric_Object;

public class Circle implements GeometricObject {

    private double radius = 1.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }
}
