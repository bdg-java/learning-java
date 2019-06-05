package com.Lesson7;

public class Circle1 {
    private  double radius=1.0;

public  Circle1() {

}
public Circle1(double radius){
    this.radius=radius;
}

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
    this.radius=radius;
}
public double getArea(){
    return Math.PI * Math.pow(this.radius, 2);
}
public double getCircumference(){
    return Math.PI * Math.pow(this.radius, 2);
}
public String toString() {
    return "Circle: [" + this.radius + "]";
}
}
