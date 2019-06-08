package com.bdg.inheritance;

public class Shape {

    private String color;
    private boolean filled;

     Shape(){
         System.out.println("default shape constructor");
        color = "red";
        filled = true;
    }
    public Shape(String color,boolean filled){
        this.color = color;
        this.filled = filled;
    }

     String getColor() {
        return color;
    }

     void setColor(String color) {
        this.color = color;
    }

     boolean isFilled(){
        return filled;
    }

     void setFilled(boolean filled){
        this.filled = filled;
    }

    public String toString(){
        return "color: " + color + ", filled: " + filled;
    }
}
