package com.bdg.agharibyan.umlhomework.rectangle;

public class Rectangle {

    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(){
    }
    public Rectangle(float length, float width){
        this.length = length;
        this.width = width;
    }
    public float getLength(){
        return this.length;
    }
    public void setLength(float length){
        this.length = length;
    }
    public float getWidth(){
        return this.width;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public double getArea(){
        double Area = this.length * this.width;
        return Area;
    }
    public double getPerimeter(){
        double perimeter = 2 * (this.length + this.width);
        return perimeter;
    }
    public String toString(){
        return "rectangle[length="+ this.length +",width="+ this.width +"]";
    }
}
