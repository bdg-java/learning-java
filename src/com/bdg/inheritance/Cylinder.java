package com.bdg.inheritance;

public class Cylinder extends GeometricFigure {

    private Circle baseCircle;
    private double height;

    public Cylinder(Circle baseCircle, double height, String name) {
        super(name);
        this.baseCircle = baseCircle;
        this.height = height;
    }

    @Override
    public double volume() {
        return baseCircle.getArea()* height;
    }
}
