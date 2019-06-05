package com.Lesson7;

public class Circle {
    private double radius=1.0;
    private String color="Red";

    public Circle(){

    }
    public  Circle(double radius) {
        this.radius=radius;
    }
    public  Circle(double radius, String color) {
        this.radius=radius;
        this.color=color;
    }
    public void getRadius(double radius) {
        this.radius=radius;
    }
    public void getColor(String color){
        this.color=color;
    }
    public String toString(){

        return "Account: " + this.radius +  this.color;
    }
    public double getArea (){
        return Math.PI * Math.pow(this.radius, 2);

    }
}



