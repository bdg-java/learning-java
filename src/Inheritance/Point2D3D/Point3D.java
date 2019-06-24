package Inheritance.Point2D3D;

public class Point3D extends Point2D {
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
    public void setXYZ(float x,float y, float z) {
        super.x = x;
        super.y = y;
        this.z = z;
    }
    public float [] getXYZ() {
        float[] array = {this.x, this.y, this.z};
        return array;
    }
    public String toString() {
        return " X: " + x + " Y: " + y + " Z: " + z;
    }
}