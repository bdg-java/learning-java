package Interitance;

public class Circle {

    public double radius;
    public String color;


    public Circle(double radius, String color) {

        this.radius = 1.0;
        this.color = "red";
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setRadius(Double radius) {
        this.radius = radius;

    }

    public void setColor(String color) {
        this.color = color;
    }

    Double getArea(Double radius, String color) {
        return Math.PI * Math.pow(radius,2);
    }

    public String toString (){
        return "Circlewithcolor" + this.radius + "  ; " + this.color ;
    }


}


