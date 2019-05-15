package com.lesson3;

public class Task196 {
    public static void main(String[] args) {
        int n = 6, t = 1, x = 2;
        double sum = x;
        int q = 2 * n + 1;
        for (int i = 3; i <= q; i += 2) {
            t = i * (i - 1) * t;
            sum += Math.pow(-1, (i - 1) / 2) * Math.pow(x, i) / t;
        }
        System.out.println(sum);
    }
}
