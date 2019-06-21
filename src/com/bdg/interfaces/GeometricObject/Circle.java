package com.bdg.interfaces.GeometricObject;

public class Circle implements GeometricObject {
    protected double radius = 1;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*this.radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.radius,2);
    }
}
