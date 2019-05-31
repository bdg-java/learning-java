package com.lesson7;

public class CirclewithColorImplementation {
    public static void main(String[] args) {
        CirclewithColor c1 = new CirclewithColor();
        CirclewithColor c2 = new CirclewithColor(0.2);
        CirclewithColor c3 = new CirclewithColor(0.3, "yellow");
        System.out.println("Circle with color:" + c1.getColor());
        System.out.println("Circle with color:" + c2.getColor());
        c2.setColor("blue");
        System.out.println(c2);
        System.out.println("Circle with color:" + c3.getRadius());
        System.out.println("Print Area " + c3.getArea());
    }


}
