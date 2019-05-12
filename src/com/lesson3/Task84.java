package com.lesson3;

public class Task84 {
    public static void main(String[] args) {
        double y = 0.0;
        double x = -6.4;
        while (x < -2.4) {
            x = (double) Math.round(x * 100) / 100;
            y += Math.exp(Math.cos(x) / Math.sin(x));
            x = x + 0.2;
        }
        System.out.println(y);
    }
}
