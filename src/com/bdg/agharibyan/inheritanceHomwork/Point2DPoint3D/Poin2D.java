package com.bdg.agharibyan.inheritanceHomwork.Point2DPoint3D;

import java.awt.geom.Point2D;

public class Poin2D {

    private float x = 0.0f;
    private float y = 0.0f;

    public Poin2D(float x, float y){
        this.x = x;
        this.y = y;
    }

//    public Point2D(){
//    }
    //inchu e error berum?

    public float getX(){
        return x;
    }

    public void setX(float x){
        this.x = x;
    }

    public float getY(){
        return y;
    }

    public void setY(float y){
        this.y = y;
    }

    float [] Array = {this.x, this.y};

    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        return Array;
    }

    public String toString(){
        return "("+ x +","+ y +")";
    }
}
