package com.bdg.Inheritance.Shape;

public class Circle  extends  Shape{
    private double radious = 1;

    public Circle(double radious) {
        this.radious = radious;
    }

    public Circle(String color, boolean filled, double radious) {
        super(color, filled);
        this.radious = radious;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }
    public double getArea(){
        return  Math.PI*(Math.pow(this.radious,2));
    }
    public double getPerimeter(){
        return 2*(Math.PI*this.radious);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radious=" + radious +
                '}';
    }
}
