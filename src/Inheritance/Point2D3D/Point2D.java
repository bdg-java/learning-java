package Inheritance.Point2D3D;

public class Point2D {
    protected float x = 0;
    protected float y = 0;

    public Point2D() {
    }
    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float [] getXY() {
        float[] array = {this.x, this.y};
        return array;
    }
    public String toString() {
        return " X: " + x + " Y: " + y;
    }
}