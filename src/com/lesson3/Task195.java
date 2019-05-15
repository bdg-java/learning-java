package com.lesson3;

public class Task195 {
    public static void main(String[] args) {
        int n = 3, t = 1, x = 2;
        double sum = 1;
        for (int i = 1; i <= n; i++) {
            t = i * t;
            sum += Math.pow(x, i) / t;
        }
        System.out.println(sum);
    }
}
