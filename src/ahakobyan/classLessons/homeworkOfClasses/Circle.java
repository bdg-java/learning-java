package ahakobyan.classLessons.homeworkOfClasses;

public class Circle {

    private double radius = 1.0;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double Circumference() {
        return Math.PI * radius * 2;
    }

    public String toString() {
        return "Circle[radius : "+ this.radius +"}";
    }
}
