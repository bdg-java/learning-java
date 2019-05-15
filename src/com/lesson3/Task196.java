package com.lesson3;

public class Task196 {
    public static void main(String[] args) {
        int n = 6, t = 1, x = 2;
        double sum = x;
        for (int i = 3; i <= n; i += 2) {
            t = i * (i - 1) * t;
            sum += Math.pow(-1, (i - 1) / 2) * Math.pow(x, i) / t;
        }
        System.out.println(sum);
    }
}
