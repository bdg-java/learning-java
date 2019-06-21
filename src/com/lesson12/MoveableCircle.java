package com.lesson12;

public class MoveableCircle implements Moveable {
    private int radius;
    private MoveablePoint center;

    public MoveableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.center.x = x;
        this.center.y = y;
        this.center.xSpeed = xSpeed;
        this.center.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        this.radius = this.radius + this.center.x;
    }

    @Override
    public void moveDown() {
        this.radius = this.radius - this.center.x;
    }

    @Override
    public void moveLeft() {
        this.radius = this.radius - this.center.y;
    }

    @Override
    public void moveRight() {
        this.radius = this.radius + this.center.y;
    }

    public String toString() {
        return super.toString() + " radius: " + this.radius;
    }
}
