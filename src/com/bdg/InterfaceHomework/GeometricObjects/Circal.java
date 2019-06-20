package com.bdg.InterfaceHomework.GeometricObjects;

public class Circal implements GeometricObject {
    public double radius = 1.0;

    Circal (double radius){
        this.radius = radius;
    }

    public double getPatametre() {
        return 2 * Math.PI * radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}
