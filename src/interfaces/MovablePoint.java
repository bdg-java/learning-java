package interfaces;

public class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;


    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        y = y + ySpeed;
    }

    public void moveDown() {
        y = y - ySpeed;
    }

    public void moveLeft() {
        x = x - xSpeed;
    }

    public void moveRight() {
        x = x + xSpeed;
    }

    public String toString() {
        return "x" + x + "y" + y + "xSpeed" + xSpeed + "ySpeed" + ySpeed;
    }
}