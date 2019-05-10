package com.bdg.lesson_21_40;

public class App_38 {
    public static void main(String[] args) {
        double a = 1, b = 0.5, c = 0.25, d = 0.125;
        double d1 = b/a, d2 = c/b, d3 = d/c;

        if (d1 == d2 && d2 == d3) {
            System.out.print("TRUE");
        } else {
            System.out.print("FALSE");
        }
    }
}

