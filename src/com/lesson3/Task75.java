package com.lesson3;

public class Task75 {
    public static void main(String[] args) {
        double p = 3.14;
        double x = -p, y = 0;
        while (x < p) {
            y += Math.pow(Math.sin(x), 2) + Math.cos(x);
            x = x + p / 8;
        }
        System.out.println(y);
    }
}
