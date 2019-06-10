package ahakobyan.ClassLessons.inheritance;

public class Rectangle extends Shape {

    protected double width = 1.0;
    protected double length = 1.0;

  public Rectangle() {

  }

  public Rectangle(double width, double length) {
      this.length = length;
      this.width = width;
  }

    public Rectangle(double width, double length, String color, boolean filled) {
      super(color,filled);
      this.width = width;
      this.length = length;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
      return this.width * this.length;
    }

    public double getPerimeter() {
      return 2 * (this.width + this.length);
    }

    public String toString() {
      return "Rectangle is Square";
    }
}
