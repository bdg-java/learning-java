package com.bdg.hr;

public class Triangle extends Shape {

    public int calculate(int a, int b) {
        return a + b;
    }

    public int calculate(double a, int b) {
        return 100;
    }

    public String figureName() {
        return "Triangle";
    }

    public int area() {
        return 50;
    }
}
