package com.lesson3;

public class Task88 {
    public static void main(String[] args) {
        double y = 0;
        for (int x = -3; x <= 3; x += 0.8) {
            if (x > 1)
                y += 6 + Math.exp(x + 8);
            else
                y += x + 4;
        }
        System.out.println(y);
    }
}
