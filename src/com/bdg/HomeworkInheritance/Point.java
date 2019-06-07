package com.bdg.HomeworkInheritance;

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float [] a = {x,y};
        return a;
    }

    public String toString(){
        return x + "," + y;
    }

}
