package com.bdg.interfaces.homework.movable;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;
    MovableCircle(int x,int y,int xSpeed,int ySpeed,int radius){
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
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

    @Override
    public String toString() {
       return "x: "+center.x+" y: "+ center.y+" xSpeed: "+ center.xSpeed+" ySpeed: "+ center.ySpeed;
    }
}
