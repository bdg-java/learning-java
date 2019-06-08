package com.bdg.Inheritance.point2d;

public class Point3D extends  Point2D {
    private float z = 0;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y, float z){
        super.x = x;
        super.y = y;
        this.z = z;
    }
    public float [] getXYZ(){
        float[] array = {this.x,this.y,this.z};
        return array;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
