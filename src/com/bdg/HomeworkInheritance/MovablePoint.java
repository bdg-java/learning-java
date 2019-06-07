package com.bdg.HomeworkInheritance;

public class MovablePoint extends Point {
    private float xspeed = 0.0f;
    private float yspeed = 0.0f;

    public MovablePoint(float x, float y, float xspeed, float yspeed) {
        super(x, y);
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public float getXspeed() {
        return xspeed;
    }

    public float getYspeed() {
        return yspeed;
    }

    public void setXspeed(float xspeed) {
        this.xspeed = xspeed;
    }

    public void setYspeed(float yspeed) {
        this.yspeed = yspeed;
    }

    public void setSpeed(float xspeed, float yspeed) {
        this.xspeed = xspeed;
        this.yspeed = yspeed;
    }

    public float[] getSpeed() {
        float[] a = {xspeed, yspeed};
        return a;
    }

    public String toString(){
        return "("+x+","+y+") "+"speed=("+xspeed + "," + yspeed + ")";
    }

    public MovablePoint move(){
        x += this.xspeed;
        y += this.yspeed;
        return this;
    }
}


