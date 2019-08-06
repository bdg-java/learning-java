package ahakobyan.classLessons.inheritance;

public class Square extends Rectangle {

    public Square() {

    }

    public Square(double side) {
        super.length = side;
    }

    public Square(double side,String color, boolean filled) {
        super.length = side;
        super.color = color;
        super.filled = filled;
    }

    public double getSide() {
        return super.length;
    }

    public void setSide(double side ) {
        super.length = side;
    }

    public void setWidth(double side) {
        super.width = side;
    }

    public void setLength(double side) {
        super.length = side;
    }

    public String toString() {
        return "This is'nt Square";
    }
}
