package com.bdg.agharibyan.inheritanceHomwork.Point2DPoint3D;

public class Point3D extends Poin2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z){
        super(x, y);
        this.z = z;
    }

//    public Point3D(){
//    }
    //inchu e error berum?

    public float getZ(){
        return z;
    }

    public void setZ(float z){
        this.z = z;
    }


    public void setXYZ(float x, float y, float z){
        super.setXY(x, y);
        this.z = z;
    }

    public float [] getXYZ(){
        float[] Array = new float []{super.getX(), super.getY(), z};
        return Array;
    }

    public String toString (){
        return "("+ super.getX() +","+ super.getY() +","+ z +")";
    }
}
