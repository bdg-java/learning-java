package com.bdg.agharibyan.interfacehomework.Movable;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center = new MovablePoint(10, 10, 1, 1);

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center.x = x;
        this.center.y = y;
        this.center.xSpeed = xSpeed;
        this.center.ySpeed = ySpeed;
        this.radius = radius;
    }

    public String toString(){
        return " MovableCircle [center's coordinats: (" + this.center.x + "," + this.center.y + ") , radius: " + this.radius +"]";
    }

    @Override
    public void moveUp(){
        center.moveUp();
    }

    @Override
    public void moveDown(){
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
