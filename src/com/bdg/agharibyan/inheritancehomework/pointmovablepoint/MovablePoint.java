package com.bdg.agharibyan.inheritancehomework.pointmovablepoint;

public class MovablePoint extends Point{

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public  MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(){
    }

    public float getXSpeed(){
        return  this.xSpeed;
    }

    public void setXSpeed(float xSpeed){
        this.xSpeed = xSpeed;
    }

    public float getYSpeed(){
        return this.ySpeed;
    }

    public void setYSpeed(float ySpeed){
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float [] getSpeed(){
        float[] array = new float[2];
        array[0] = this.xSpeed;
        array[1] = this.ySpeed;
        return array;
    }

    public String toString(){
        return "("+ super.x +","+ super.y +"),speed=("+ this.xSpeed +","+ this.ySpeed +")";
    }

    public MovablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
