package com.lesson9;

public class Point3D extends Point2D {
    private float z;

    public Point3D() {
        this.z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
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
        float[] arr = new float[3];
        arr = super.getXY();
        arr[2] = z;
        return arr;
    }

    public String toString() {
        return super.toString().replace(")", "") + "," + this.z + ")";
    }

}
