package com.bdg.classes;

import com.bdg.Inheritance.Shape.Shape;

public class Rectangle  {
    private double length = 1.0f;
    private double width = 1.0f;
    public Rectangle(){

    }
    public Rectangle(double width , double length){
        this.length = length;
        this.width = width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea(){
        return getWidth()*getWidth();
    }


    public double getPerimeter(){
        return 2*(getWidth()+getWidth());
    }

    public String toString(){
        return "Rectangle[ length = "+this.length+" ,width = "+this.width+"]";
    }



}
