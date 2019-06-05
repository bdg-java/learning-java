package com.bdg.classes;

public class Circle {
    private double radius = 1.0;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadious() {
        return radius;
    }

    public void setRadious(double radius) {
        this.radius = radius;
    }
    public  double getCircumference(){
        return this.radius*Math.PI;
    }

    public String toString(){
        return "Circle[radius = "+ this.radius+"]";
    }
}
