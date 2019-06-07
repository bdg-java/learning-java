package Inheritance.PointMovablePoint;

public class MovablePoint extends Point {
    private float xSpeed = 0;
    private float ySpeed = 0;

    public MovablePoint() {
    }
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = x;
        this.ySpeed = y;
    }
    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float getxSpeed() {
        return xSpeed;
    }
    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getySpeed() {
        return ySpeed;
    }
    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float [] getSpeed(){
        float[] array = {xSpeed, ySpeed};
        return array;
    }
    public MovablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
    public String toString() {
        return " X: " + x + " Y: " + y + " xSpeed: " + xSpeed + " ySpeed: " + ySpeed;
    }
}
