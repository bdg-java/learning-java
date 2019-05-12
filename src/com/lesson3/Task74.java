package com.lesson3;

public class Task74 {
    public static void main(String[] args) {
        double x = -3.8, y = 0;
        while (x <= 5.4) {
            y += Math.pow(2, x + 4);
            x = x + 0.3;
        }
        System.out.println(y);
    }
}
