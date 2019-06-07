package ahakobyan.ClassLessons.inheritance;

public class MovablePoint extends Point {

    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {

    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.ySpeed = ySpeed;
        this.xSpeed = xSpeed;
    }

    public float getxSpeed() {
        return this.xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return this.ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] result = new float[2];
        result[0] = xSpeed;
        result[1] = ySpeed;
        return result;
    }

    @Override
    public String toString() {
        return "(" + this.x + "," + this.y + ")";
    }
}
