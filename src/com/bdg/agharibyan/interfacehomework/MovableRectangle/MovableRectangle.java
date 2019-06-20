package com.bdg.agharibyan.interfacehomework.MovableRectangle;

import com.bdg.agharibyan.interfacehomework.Movable.Movable;
import com.bdg.agharibyan.interfacehomework.Movable.MovableCircle;
import com.bdg.agharibyan.interfacehomework.Movable.MovablePoint;

public class MovableRectangle implements Movable {

    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed){
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }

    public String toString(){
        return "Movable Rectangle: [topleft pont's coordinators: " + this.topLeft + ", bottomRight point's coordinators: " + this.bottomRight + "]";
    }

    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();
    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
