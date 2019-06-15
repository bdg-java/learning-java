package com.bdg.Point2DPoint3D;

public class Point3D extends Point2D {
    protected float z=0.0f;
    public Point3D (float x, float y, float z){
        super(x, y);
        this.z = z;
    }
    public void setZ(float z) {
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = new float[3];
        array = super.getXY();
        array[2] = z;
        return array;
    }

    public String toString() {
        return super.toString().replace(")", "") + "," + this.z + ")";
    }
}
