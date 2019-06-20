package com.bdg.interfaces.homework.movable;

public class MovableDemo {
    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(1,2,3,4,6);
        movableCircle.moveUp();
        System.out.println(movableCircle);
        MovablePoint movablePoint = new MovablePoint(2,3,9,7);
        System.out.println(movablePoint);
        movablePoint.moveUp();
        System.out.println(movablePoint);
        MovableRectangle movableRectangle = new MovableRectangle(5,8,43,4,3,3);
        System.out.println(movableRectangle);
        movableRectangle.moveDown();
        System.out.println(movableRectangle);
    }
}
