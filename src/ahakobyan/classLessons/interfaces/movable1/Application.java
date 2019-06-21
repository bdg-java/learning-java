package ahakobyan.classLessons.interfaces.movable1;

public class Application {
    public static void main(String[] args) {

        MovableRectangle movableRectangle = new MovableRectangle(1,2,3,4,5,6);
        MovableRectangle movableRectangle1 = new MovableRectangle(1,2,3,4,5,6);
        MovableRectangle movableRectangle2 = new MovableRectangle(1,2,3,4,5,6);
        MovableRectangle movableRectangle3 = new MovableRectangle(1,2,3,4,5, 6);
        movableRectangle.moveDown();
            System.out.println(movableRectangle);
        movableRectangle1.moveLeft();
            System.out.println(movableRectangle1);
        movableRectangle2.moveRight();
            System.out.println(movableRectangle2);
        movableRectangle3.moveUp();
            System.out.println(movableRectangle3);
        MovablePoint movablePoint = new MovablePoint(1,2,3,4);
        MovablePoint movablePoint1 = new MovablePoint(1,2,3,4);
        MovablePoint movablePoint2 = new MovablePoint(1,2,3,4);
        MovablePoint movablePoint3 = new MovablePoint(1,2,3,4);
        movablePoint.moveDown();
            System.out.println(movablePoint);
        movablePoint1.moveUp();
            System.out.println(movablePoint1);
        movablePoint2.moveLeft();
            System.out.println(movablePoint2);
        movablePoint3.moveRight();
            System.out.println(movablePoint3);
    }
}
