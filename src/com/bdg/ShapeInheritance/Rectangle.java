package com.bdg.ShapeInheritance;

public class Rectangle extends Shape {

    protected double width = 1.0;
    protected double length = 1.0;

//    public Rectangle(double width, double length){
//        this.width = width;
//        this.length = length;
//    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double[] getArea(){
        double []a = {this.length, this.width};
        return a;
    }

    public double[] getPerimeter(){
        double []a = {this.length, this.width};
        return a;
    }

    public String toString(){
        return color + "," + filled + "," + width + "," + length;
    }
}