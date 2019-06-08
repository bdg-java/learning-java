package com.bdg.agharibyan.inheritancehomework.shapeandsubclasses;

public class Application {
    public static void main(String[] args) {

        Shape shapeDemo = new Shape();
        Circle circleDemo = new Circle();
        Rectangle rectangleDemo = new Rectangle();
        Square squareDemo = new Square();

        System.out.println(shapeDemo.getColor());
        System.out.println(shapeDemo.toString());
        System.out.println(circleDemo.getRadius());
        System.out.println(circleDemo.getArea());
        System.out.println(circleDemo.getPerimeter());
        System.out.println(circleDemo.toString());
        System.out.println(rectangleDemo.getWidth());
        System.out.println(rectangleDemo.getLength());
        System.out.println(rectangleDemo.getArea());
        System.out.println(rectangleDemo.getPerimeter());
        System.out.println(rectangleDemo.toString());
        System.out.println(squareDemo.getSide());
        squareDemo.setLength(5);
        System.out.println(squareDemo.getSide());
        System.out.println(squareDemo.toString());
    }
}

