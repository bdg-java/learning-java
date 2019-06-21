package com.bdg.interfaces.Movable;

import com.bdg.interfaces.Movable.Movable;

public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {

    }

    @Override
    public void moveUp() {
            x++;
    }

    @Override
    public void moveDown() {
        x--;
    }

    @Override
    public void moveLeft() {
        y--;
    }

    @Override
    public void moveRight() {
        y++;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
}
