package ahakobyan.classLessons.interfaces.geometricObject;

public class Circle implements GeometricObject {

    protected double radius = 1.0;


    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {

    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }
}
