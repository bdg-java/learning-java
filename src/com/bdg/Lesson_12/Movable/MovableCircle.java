package com.bdg.Lesson_12.Movable;

public class MovableCircle extends MovablePoint implements Movable {

    int radius;
    MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius, MovablePoint center) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
        this.center = center;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
    @Override
    public void moveUp(){
        this.y += ySpeed;
    }

    @Override
    public void moveDown() {
        this.y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x -= xSpeed;
    }

    @Override
    public void moveRight() {
        this.x += xSpeed;
    }
}
