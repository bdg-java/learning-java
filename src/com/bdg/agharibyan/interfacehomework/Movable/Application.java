package com.bdg.agharibyan.interfacehomework.Movable;

public class Application {

    public static void main(String[] args) {
        MovableCircle movableCircle = new MovableCircle(10, 10, 1,1,2);
        System.out.println("Initial position:"+ movableCircle.toString());
        movableCircle.moveUp();
        System.out.println("After MoveUp:"+ movableCircle.toString());
        movableCircle.moveDown();
        System.out.println("After MoveDown:"+ movableCircle.toString());
        movableCircle.moveLeft();
        System.out.println("After MoveLeft:"+ movableCircle.toString());
        movableCircle.moveRight();
        System.out.println("After MoveRight:"+ movableCircle.toString());
    }
}
