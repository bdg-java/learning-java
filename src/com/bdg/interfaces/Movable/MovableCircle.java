package com.bdg.interfaces.Movable;

public class MovableCircle extends MovablePoint implements Movable {
    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed ,int radius) {

        this.center.x = x;
        this.center.y = y;
        this.radius = radius ;
        this.center.xSpeed = xSpeed;
        this.center.ySpeed = ySpeed;
    }


    @Override
    public void moveUp() {
        this.radius += this.center.x;
    }

    @Override
    public void moveDown() {
        this.radius -= this.center.x;
    }

    @Override
    public void moveLeft() {
        this.radius -= this.center.y;
    }

    @Override
    public void moveRight() {
        this.radius += this.center.y;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
