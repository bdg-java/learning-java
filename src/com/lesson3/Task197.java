package com.lesson3;

public class Task197 {
    public static void main(String[] args) {
        int n = 2, t = 1, x = 2;
        double sum = 1;
        int q = 2 * n;
        for (int i = 2; i <= q; i += 2) {
            t = i * (i - 1) * t;
            sum += Math.pow(-1, i / 2) * Math.pow(x, i) / t;
        }
        System.out.println(sum);
    }
}
