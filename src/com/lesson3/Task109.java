package com.lesson3;

public class Task109 {
    public static void main(String[] args) {
        double a = 1, b = 2, sum = 0;
        int n = 6;
        for (int i = 1; i <= n; i++) {
            sum += a + b * b;
            a = 6 * a - 4;
            b = 5 * Math.atan(b) + 3;
        }
        System.out.println(sum);
    }
}
