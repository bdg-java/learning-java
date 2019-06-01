package com.bdg.agharibyan.uml_tasks;

import org.jetbrains.annotations.Contract;

public class CircleSimplified {

    private double radius = 1.0;

    @Contract(pure = true)
    public CircleSimplified(){
    }
    @Contract(pure = true)
    public CircleSimplified(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        double Area = Math.PI * Math.pow(this.radius,2);
        return Area;
    }
    public double getCircumference(){
        double Circumference = 2 * Math.PI * this.radius;
        return Circumference;
    }
    public String toString(){
        return "Circle[radius="+ this.radius + "]";
    }
}
