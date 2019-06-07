package com.bdg.Lesson_9.Point_2D;

public class Point_3D extends Point_2D {
    private float z = 0;

    public Point_3D() {

    }

    public Point_3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float getXYZ(){
        return x*y*z;
    }

    @Override
    public String toString() {
        return "X: " + x + "Y: " + y + "Z: "+z;
    }
}
