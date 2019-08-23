package com.bdg.interfaces.MovableRectangle;

import com.bdg.interfaces.Movable.Movable;
import com.bdg.interfaces.Movable.MovablePoint;

public class MovableRectangle extends MovablePoint implements Movable {
    MovablePoint topLeft;
    MovablePoint bottomRight;

    public MovableRectangle (int x1 ,int y1 ,int x2 ,int y2 ,int xSpeed ,int ySpeed){

    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
