package com.bdg.interfacelesson.movable;

public class MovableCircle extends MovablePoint implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius ) {
        super(x, y, xSpeed, ySpeed);
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return (center.x + "," + center.y);
    }

    @Override
    public void moveRight() {
        center.x = center.x + center.xSpeed;
    }

    @Override
    public void moveLeft() {
        center.x = center.x - center.xSpeed;
    }

    @Override
    public void moveDown() {
        center.y = center.y - center.ySpeed;
    }

    @Override
    public void moveUP() {
        center.y = center.y + center.ySpeed;
    }

    public static void main(String[] args) {
        Movable m1 = new MovableCircle(1, 2, 3, 4, 7);
        System.out.println(m1);
    }
}
