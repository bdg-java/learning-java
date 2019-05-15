package com.lesson3;

public class Task200 {
    public static void main(String[] args) {
        int n = 4, x = 2;
        double sum = 0, t = 1, q = 1;
        for (int i = 2; i <= n; i++) {
            t = t * (2 * i - 1);
            q = 2 * i * q;
            sum += Math.pow(-1, i - 1) * t * Math.pow(x, i) / q;
        }
        System.out.println(sum);
    }
}
