package com.bdg.agharibyan.uml_tasks.CircleFinal;

import org.jetbrains.annotations.Contract;

public class CircleFinal {

    private double radius = 1.0;
    private String color = "red";

    @Contract(pure = true)// Idea-n arajarkec, vor import anem - bayc inchi hamar e chem haskanum
    public CircleFinal(){
    }
    @Contract(pure = true)// Idea-n arajarkec, vor import anem - bayc inchi hamar e chem haskanum
    public CircleFinal(double radius){
        this.radius = radius;
    }
    @Contract(pure = true)// Idea-n arajarkec, vor import anem - bayc inchi hamar e chem haskanum
    public CircleFinal(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){

        return this.color;
    }
    public void setRadius(double radius){

        this.radius = radius;
    }
    public void setColor(String color){

        this.color = color;
    }
    public String toString(){

        return ("Circle[radius="+ this.radius +", color="+ this.color + "]");
    }
    public double getArea(){
        double Area = Math.PI * Math.pow(this.radius,2);
        return Area;
    }
}
