package com.lesson3;

public class Task162 {
    public static void main(String[] args) {
        int max = -1;
        for (int i = 9999; i >= 1000; i--) {
            double t = i * 14;
            if (Math.sqrt(t) % 1 == 0.0) {
                max = i;
                break;
            }
        }
        System.out.println(max);
    }
}
