package ahakobyan.classLessons.interfaces.movable;

public class Application {
    public static void main(String[] args) {

        MovablePoint movablePoint = new MovablePoint(1,2,21,25);
        MovablePoint movablePoint1 = new MovablePoint(1,2,21,25);
        MovablePoint movablePoint2 = new MovablePoint(1,2,21,25);
        MovablePoint movablePoint3 = new MovablePoint(1,2,21,25);
        MovablePoint center = new MovablePoint(2,3,5,6);
        MovableCircle movableCircle = new MovableCircle(1,2,21,25,2, center);
        MovableCircle movableCircle1 = new MovableCircle(1,2,21,25,2, center);
        MovableCircle movableCircle2 = new MovableCircle(1,2,21,25,2, center );
        MovableCircle movableCircle3 = new MovableCircle(1,2,21,25,2, center);
        movablePoint.moveUp();
            System.out.println(movablePoint);
        movablePoint1.moveDown();
            System.out.println(movablePoint1);
        movablePoint2.moveRight();
            System.out.println(movablePoint2);
        movablePoint3.moveLeft();
            System.out.println(movablePoint3);
        movableCircle.moveUp();
            System.out.println(movableCircle);
        movableCircle1.moveDown();
            System.out.println(movableCircle1);
        movableCircle2.moveLeft();
            System.out.println(movableCircle2);
        movableCircle3.moveRight();
            System.out.println(movableCircle3);
    }
}
