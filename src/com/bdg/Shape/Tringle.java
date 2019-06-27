package com.bdg.Shape;

public class Tringle extends Shape {
    public int calculate(int a, int b){
        return a+b;
    }
    public int calculate (double a, int b){
        return 100;
    }

    public String figureName(){
        return "tringle";
    }

    public int area() {
        return 50;
    }
}
