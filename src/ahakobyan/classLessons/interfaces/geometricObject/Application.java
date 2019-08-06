package ahakobyan.classLessons.interfaces.geometricObject;

public class Application {
    public static void main(String[] args) {

        Circle circle = new Circle(2.0);
        System.out.println(circle.getArea());
        Circle circle1 = new Circle(3.0);
        System.out.println(circle1.getPerimetr());
        ResizableCircle resizableCircle = new ResizableCircle(2.0);
        System.out.println(resizableCircle.resize(5));
    }
}