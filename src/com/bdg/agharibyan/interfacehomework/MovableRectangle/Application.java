package com.bdg.agharibyan.interfacehomework.MovableRectangle;

public class Application {

    public static void main(String[] args) {
        MovableRectangle movableRectangle = new MovableRectangle(10, 10, 20,5,1, 1);
        System.out.println("Initial position:"+ movableRectangle.toString());
        movableRectangle.moveUp();
        System.out.println("After MoveUp:"+ movableRectangle.toString());
        movableRectangle.moveDown();
        System.out.println("After MoveDown:"+ movableRectangle.toString());
        movableRectangle.moveLeft();
        System.out.println("After MoveLeft:"+ movableRectangle.toString());
        movableRectangle.moveRight();
        System.out.println("After MoveRight:"+ movableRectangle.toString());
    }

}
