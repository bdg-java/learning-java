package com.bdg.Lesson_9.Point_2D;

public class Point_2D {
    protected float x = 0;
    protected float y = 0;

    public Point_2D() {

    }

    public Point_2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getXY() {
        return x * y;
    }

    @Override
    public String toString() {
        return "X: " + x + "Y: " + y;
    }
}
