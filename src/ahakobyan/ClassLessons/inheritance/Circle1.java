package ahakobyan.ClassLessons.inheritance;

public class Circle1 extends Shape {

    private double radius = 1.0;

    public Circle1() {

    }

    public Circle1(double radius) {
        this.radius = radius;
    }

    public Circle1(double radius,String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2*radius * Math.PI;
    }
}
