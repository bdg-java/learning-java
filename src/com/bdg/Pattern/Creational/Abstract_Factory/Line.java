package com.bdg.Pattern.Creational.Abstract_Factory;

public class Line implements GeometricShape {
    @Override
    public void draw() {
        System.out.println("Line is Drawn");
    }
}
