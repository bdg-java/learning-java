package com.bdg.agharibyan.inheritancehomework.pointmovablepoint;

public class Application {
    public static void main(String[] args) {

        Point pointDemo = new Point(5.5f, 1.1f);
        MovablePoint movablePoint = new MovablePoint(100f, 200f);

        System.out.println("x:"+ pointDemo.getX());
        System.out.println("y:"+ pointDemo.getY());
        pointDemo.setX(1.1f);
        pointDemo.setY(5.5f);
        System.out.println(pointDemo);
        pointDemo.setXY(4.4f, 8.8f);
        System.out.println(pointDemo.toString());
        System.out.println(movablePoint.getX());
        movablePoint.setX(6f);
        System.out.println(movablePoint.getX());
        System.out.println(movablePoint.getY());
        System.out.println(movablePoint.getXSpeed());
        System.out.println(movablePoint.getYSpeed());
        movablePoint.setSpeed(400f, 500f);
        System.out.println(movablePoint.toString());

    }
}
