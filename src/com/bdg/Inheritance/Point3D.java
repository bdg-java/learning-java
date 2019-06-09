package com.bdg.Inheritance;

public class Point3D extends Point2D {

    private float z = 0.0f;

    public Point3D(float x, float y, float z) {

        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return this.z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {

        super.setXY(x, y);
        this.z = y;
    }

    public float[] getXYZ() {
        float[] Array = new float[]{super.getX(), super.getY(), z};
        return Array;
    }

    public String toString() {
        return " ( " + super.getX() + " , " + super.getY() + " , " + z + " )";


    }
}