package com.bdg.agharibyan.inheritancehomework.shapeandsubclasses;

public class Square extends  Rectangle {

    public Square(){
    }

    public Square(double side){
    }

    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return super.getLength();
    }

    public void setSide(double side){
        super.setLength(side);
    }

    public void setWidth(double side){
        super.setWidth(side);
    }

    public void setLength(double side){
        super.setLength(side);
    }

    public String toString(){
        return"Square";
    }
}
