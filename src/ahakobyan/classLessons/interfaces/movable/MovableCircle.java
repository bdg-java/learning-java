package ahakobyan.classLessons.interfaces.movable;

public class MovableCircle extends MovablePoint implements Movable {

    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius, MovablePoint center) {
        super.x = center.x;
        super.y = center.y;
        super.xSpeed = center.xSpeed;
        super.ySpeed = center.ySpeed;
        this.radius = radius;
        this.center = center;
    }

    public String toString() {
        return "x:"+center.x+" y: " + center.y + " xSpeed:" +xSpeed+ " ySpeed: " +ySpeed+ "";
    }

    @Override
    public void moveDown() {
        center.y = center.y - center.ySpeed;

    }

    @Override
    public void moveUp() {
        center.y = center.y + center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x = center.x - center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x = center.x + center.xSpeed;
    }


}
