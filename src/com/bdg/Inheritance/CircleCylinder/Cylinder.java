package com.bdg.Inheritance.CircleCylinder;

public class Cylinder extends  Circle {
    private double height = 1;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radious, double height) {
        super(radious);
        this.height = height;
    }

    public Cylinder(double radious, String color, double height) {
        super(radious, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){//V= p *r2 *h
            return  Math.PI*Math.pow(radious,2)*height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                ", radious=" + radious +
                ", color='" + color + '\'' +
                '}';
    }
}
