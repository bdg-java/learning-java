package com.bdg.agharibyan.interfacehomework.Movable;

public class MovableCircle extends MovablePoint implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public String toString(){
        return " MovableCircle's center's coordinats (" + this.x + "," + this.y + ")";
    }

    @Override
    public void moveUp(){
        super.moveUp();
    }

    @Override
    public void moveDown(){
        super.moveDown();
    }

    @Override
    public void moveLeft() {
        super.moveLeft();
    }

    @Override
    public void moveRight() {
        super.moveRight();
    }
}
