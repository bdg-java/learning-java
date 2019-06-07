package com.bdg.HomeworkInheritance;

public class Point2D {
   protected float x = 0.0f;
   protected float y = 0.0f;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float y, float x) {
        this.y = y;
        this.x = x;
    }

    public float[] getXY(float y, float x) {
        float [] a = {x,y};
        return a;
    }

    public String toString(){
        return x + "," + y;
    }
}



