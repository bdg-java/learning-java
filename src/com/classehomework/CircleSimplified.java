package com.classehomework;

public class CircleSimplified {
    private double radius = 1.0;

    public CircleSimplified() {
    }

    public CircleSimplified(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2.0);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "CircleSimplified{" +
                "radius=" + radius +
                '}';
    }
}
