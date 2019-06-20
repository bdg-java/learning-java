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
        center.y = center.y+ center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y = center.y- center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x = center.x- center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x = center.x+ center.xSpeed;
    }

    @Override
    public String toString() {
       return "x: "+center.x+" y: "+ center.y+" xSpeed: "+ center.xSpeed+" ySpeed: "+ center.ySpeed;
    }
}
