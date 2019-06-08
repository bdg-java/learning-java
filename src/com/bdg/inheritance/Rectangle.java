package com.bdg.inheritance;

public class Rectangle extends Shape {

    private double length;
    private double width;
     Rectangle(){
        length = 1.0;
        width = 1.0;
    }
    private Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    private Rectangle(double length,double width,String color,boolean filled){
        this.length = length;
        this.width = width;
        setColor(color);
        setFilled(filled);
    }


    public static Rectangle getInstance(double length,double width,String color,boolean filled){
        if (length <= 0 || width <= 0) {
            return null;
        }

        return new Rectangle(length,width,color,filled);
    }

    public static  Rectangle createRectangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            System.out.println("Invalid parameters ");
            return null;
        }
        return new Rectangle(length,width);

    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle[length=" + length + "width=" + width + "]";
    }

}
