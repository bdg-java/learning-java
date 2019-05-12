package com.lesson3;

public class Task161 {
    public static void main(String[] args) {
        int min = -1;
        for (int i = 1000; i <= 9999; i++) {
            double t = i * 26;
            if (Math.sqrt(t) % 1 == 0.0) {
                min = i;
                break;
            }
        }
        System.out.println(min);

    }
}
