package com.bdg.ShapeInheritance;

public class Circale extends Shape{
    private double radius;

    public Circale(String color, boolean filled ,double radius){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return color + ", " + filled + "," + radius;
    }
}
