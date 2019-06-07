package com.bdg.HomeworkInheritance;

public class Circale {
   private double radius = 1.0;
   private String color = "red";

   public Circale(){

   }
   public Circale( Double radius){
        this.radius = radius;
   }
    public Circale( Double radius, String color){
       this.radius = radius;
       this.color = color;

    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea(){
      return radius;
    }

    public String toString(){
     return "radius: r" + "," + "color" + "c";
    }
}
