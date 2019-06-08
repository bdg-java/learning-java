package com.bdg.agharibyan.inheritanceHomework.Circle;

public class Application {
    public static void main(String[] args) {

        Circle myCircle = new Circle();
        Cylinder myCylinder = new Cylinder();

        System.out.println(myCircle.toString());
        System.out.println("Radius before change:"+ myCircle.getRadius());
        System.out.println("Color before change:"+ myCircle.getColor());
        System.out.println("Height before change:"+ myCylinder.getHeight());
        System.out.println("Area before change:"+ myCircle.getArea());
        System.out.println("Volume before change"+ myCylinder.getVolume());
        myCircle.setRadius(2);
        myCircle.setColor("green");
        myCylinder.setHeight(5);
        System.out.println(myCircle.toString());
        System.out.println("Radius after change:"+ myCircle.getRadius());
        System.out.println("Color after change:"+ myCircle.getColor());
        System.out.println("Height after change:"+ myCylinder.getHeight());
        System.out.println("Area after change:"+ myCircle.getArea());
        System.out.println("Volume after change"+ myCylinder.getVolume());
    }
}
