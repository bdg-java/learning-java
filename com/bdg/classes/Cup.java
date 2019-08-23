package com.bdg.classes;

public class Cup {

    private double radious  ;//base radius
    private double height;

    //    private double middleRadious ;//  radius of the bulging part
//    private double topRadious;
//    private int sides;

    public Cup() {
    }

    public Cup(double radious, double height) {
        this.radious = radious;
        this.height = height;
    }

    public double getRadious() {
        return radious;
    }

    public void setRadious(double radious) {
        this.radious = radious;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return Math.PI*this.height*Math.pow(this.radious,2);
    }
//V = 3,2 * r * R * H


}
