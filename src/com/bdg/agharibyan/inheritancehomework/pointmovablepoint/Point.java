package com.bdg.agharibyan.inheritancehomework.pointmovablepoint;

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Point(){
    }

    public float getX(){
        return this.x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return this.y;
    }

    public void setY(float y){
        this.y = y;
    }

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float [] getXY(){
        float[] array = new float[2];
        array[0] = this.x;
        array[1] = this.y;
        return array;
    }

    public String toString(){
        return "("+ this.x +","+ this.y +")";
    }
}
