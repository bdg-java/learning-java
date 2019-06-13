package Inheritance.Shape;

public class Rectangle extends Shape {
    protected double width = 1;
    protected double length = 1;

    public Rectangle() {
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.width * this.length;
    }
    public double getPerimeter(){
        return 2 * (this.width + this.length);
    }
    public String toString() {
        return " Width: " + width + " Length: " + length;
    }
}