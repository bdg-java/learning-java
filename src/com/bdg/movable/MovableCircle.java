package com.bdg.movable;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed,int radius){
        this.center.x=x;
        this.center.y=y;
        this.radius=radius;
        this.center.xSpeed=xSpeed;
        this.center.ySpeed=ySpeed;

    }
    public void moveUp() {
        this.radius = this.radius + this.center.x;
    }


    public void moveDown() {
        this.radius = this.radius - this.center.x;
    }


    public void moveLeft() {
        this.radius = this.radius - this.center.y;
    }


    public void moveRight() {
        this.radius = this.radius + this.center.y;
    }

    public String toString() {
        return super.toString() + " radius: " + this.radius;
    }

}
