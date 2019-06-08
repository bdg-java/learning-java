package com.bdg.ShapeInheritance;
//
//public class Square  extends Rectangle{
//    private double side;
//
////    public Square(double side, double length, double width){
////        super(length, width);
////        this.side = side;
////    }
//}

public class Square extends Rectangle {


    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return super.length;
    }
}