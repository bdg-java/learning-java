package com.bdg.Inheritance;

public class Point2D {

    private float x = 0.0f;
    private float y = 0.0f;

    public Point2D ( float x, float y){
        this.x = x;
        this.y = y;
}
     public Point2D (){

     }

     public Float getX (){
        return this.x;
     }

     public void setX ( float x){
        this.x = x;
     }

     public Float getY (){
        return this.y;
     }

     public void setY ( float y){
        this.y = y;

     }

    float [] Array = {this.x, this.y};

     public void setXY ( float x, float y){
        this.x = x;
        this.y = y ;
     }

     public   float [] getXY(){
         return Array;
    }

    public String toString () {
        return " ( " + x + " , " + y + " ) ";


    }

}
