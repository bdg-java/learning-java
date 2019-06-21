package com.bdg.interfacelesson.movable;

public class MovableRectangle extends MovablePoint implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle (int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        super(x1, y1, xSpeed, ySpeed);
        this.x = x2;
        this.y = y2;
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    @Override
    public void moveUP() {
        topLeft.moveUP();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
    }

    @Override
    public void moveLeft() {
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        bottomRight.moveRight();
    }
}
