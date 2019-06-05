package com.bdg.classes;

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;
    public Rectangle(){

    }
    public Rectangle(float width , float length){
        this.length = length;
        this.width = width;
    }


    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
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
