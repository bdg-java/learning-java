package com.bdg.agharibyan.inheritancehomework.point2dpoint3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

    public Point3D(){
    }

    public float getZ(){
        return z;
    }

    public void setZ(float z){
        this.z = z;
    }


    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float [] getXYZ(){
        float[] array = new float [3];
        array[0] = this.x;
        array[1] = this.y;
        array[2] = this.z;
        return array;
    }

    public String toString (){
        return "("+ super.getX() +","+ super.getY() +","+ z +")";
    }
}