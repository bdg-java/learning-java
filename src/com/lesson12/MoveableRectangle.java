package com.lesson12;

public class MoveableRectangle implements Moveable {
    private MoveablePoint topLeft;
    private MoveablePoint bottomRight;

    public MoveableRectangle(int x, int y, int xSpeed, int ySpeed, int x2, int y2, int xSpeed2, int ySpeed2) {
        this.topLeft.x = x;
        this.topLeft.y = y;
        this.topLeft.xSpeed = xSpeed;
        this.topLeft.ySpeed = ySpeed;
        this.bottomRight.x = x2;
        this.bottomRight.y = y2;
        this.bottomRight.xSpeed = xSpeed2;
        this.bottomRight.ySpeed = ySpeed2;
    }

    @Override
    public void moveUp() {
        this.topLeft.x++;
    }

    @Override
    public void moveDown() {
        this.bottomRight.x--;
    }

    @Override
    public void moveLeft() {
        this.topLeft.y++;
    }

    @Override
    public void moveRight() {
        this.bottomRight.y++;
    }

    public String toString() {
        return topLeft.toString() + bottomRight.toString();
    }
}
