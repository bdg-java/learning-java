package ahakobyan.classLessons.homeworkOfClasses;

public class Circle_Final {

    private double radius = 1.0;
    private String color = "red";

    public Circle_Final() {
    }

    public  Circle_Final(double radius) {
        this.radius = radius;
    }

    public Circle_Final(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius (double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "Circle[radius : "+ this.radius +", color : "+ this.color +"]";
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
