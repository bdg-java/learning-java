package com.bdg.Point2DPoint3D;

public class Point2D {
    protected float x=0.01f;
    protected float y=0.01f;
     public Point2D(float x, float y) {
         this.x=x;
         this.y=y;
     }
     public Point2D() {

     }
     public float getX(){
         return this.x;
     }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return this.y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
         this.x=x;
         this.y=y;
    }
    public float[] getXY() {
        float[] array = new float[2];
        array[0] = this.x;
        array[1] = this.y;
        return array;
    }
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }

}
