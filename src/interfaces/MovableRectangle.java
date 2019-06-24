package interfaces;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x, int y, int xSpeed, int ySpeed, int x2, int y2, int xSpeed2, int ySpeed2) {
        this.topLeft.x = x;
        this.topLeft.y = y;
        this.topLeft.xSpeed = xSpeed;
        this.topLeft.ySpeed = ySpeed;
        this.bottomRight.x = x2;
        this.bottomRight.y = y2;
        this.bottomRight.xSpeed = xSpeed2;
        this.bottomRight.ySpeed = ySpeed2;
    }
    @Override
    public void moveUp() {
        topLeft.moveUp();
        bottomRight.moveUp();
    }

    @Override
    public void moveDown() {
        topLeft.moveDown();
        bottomRight.moveDown();

    }

    @Override
    public void moveLeft() {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }

    @Override
    public void moveRight() {
        topLeft.moveRight();
        bottomRight.moveRight();

    }

    @Override
    public String toString() {
        return "x1: "+ topLeft.x+" y1: "+ topLeft.y+" x2: "+bottomRight.x+" y2: "+ bottomRight.y;
    }
}
