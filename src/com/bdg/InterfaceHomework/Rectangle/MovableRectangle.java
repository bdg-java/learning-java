package com.bdg.InterfaceHomework.Rectangle;


//import com.bdg.InterfaceHomework.Movable.Movable;
import com.bdg.InterfaceHomework.Movable.MovablePoint;


public class MovableRectangle implements Movable {
        private MovablePoint topLeft;
        private MovablePoint bottomRight;

        MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
            topLeft = new MovablePoint(y1, x1, xSpeed, ySpeed);
            bottomRight = new MovablePoint(y2, x2, ySpeed, xSpeed);
        }


    public void moveUp(){
        topLeft.y += topLeft.ySpeed;
        topLeft.y += topLeft.ySpeed;
    }
    public void moveDown(){
        bottomRight.y -= bottomRight.ySpeed;
        bottomRight.y -= bottomRight.ySpeed;
    }

    public void moveLeft(){
            topLeft.x -= topLeft.xSpeed;
            topLeft.x -= topLeft.xSpeed;
    }

    public void moveRight(){
            bottomRight.x += bottomRight.xSpeed;
            bottomRight.x += bottomRight.xSpeed;
    }

    public String toString(){
        return "topLeft : " + topLeft.x +" , " + topLeft.y +" "+ "bottomRight : " + bottomRight.x  + " , " + bottomRight.y;
    }

    }
