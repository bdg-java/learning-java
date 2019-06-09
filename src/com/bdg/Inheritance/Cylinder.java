package com.bdg.Inheritance;

public class Cylinder  extends Circle {

    private double height = 1.0;

    public Cylinder (){
    }

    public Cylinder ( double radius){
        super(radius);

    }

    public Cylinder ( double radius,  double height){
        super(radius);
        this.height = height;
    }

    public Cylinder ( double radius, double hight , String color){
        super(height,color);
        this.height = hight;
    }

    public double getHigth (){
        return height;
    }

    public void setHeight (double height){
        this.height = height;
    }

    public double getVolume ( ){

        return height * super.getArea();


        }

    }



}
