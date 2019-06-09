package Classed;

public class Circle {


    private Double radius;
    private String color;


    //double getArea() methody bacakayuma Tigran jan
    public Circle(Double radiouse, String color) {
        this.radius = 1.0;
        this.color = "red";
    }


    //methodneri anunery camel case-ov Tigran jan  orinak getRadius()
    public double getradius() {
        return this.radius;

    }

    public String getcolor() {
        return this.color;
    }

    public void setradiouse(Double radouse) {
        this.radius = radius;
    }

    public void setclor(String color) {
        this.color = color;

    }

    public String toString() {
        return "CirclewithColor: " + this.radius + ", " + this.color;
    }


}

