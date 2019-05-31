package com.bdg.classes;

public class Circle_final {
    private double radius = 1.0;
    private String color = "red";

    public Circle_final(){

    }
    public Circle_final(double radius){

    }
    public Circle_final(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        return "Circle[ radius = "+ getRadius()+", color = "+ getColor();
    }
    public double getArea(){
        return Math.pow(getRadius()*Math.PI,2);
    }
}
