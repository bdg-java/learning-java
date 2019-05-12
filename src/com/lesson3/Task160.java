package com.lesson3;

public class Task160 {
    public static void main(String[] args) {
        int min = -1;
        for (int i = 100; i <= 999; i++) {
            double t = i * 16;
            if (Math.sqrt(t) % 1 == 0.0) {
                min = i;
                break;
            }
        }
        System.out.println(min);
    }
}
