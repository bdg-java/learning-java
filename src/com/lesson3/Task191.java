package com.lesson3;

public class Task191 {
    public static void main(String[] args) {
        int sum = 0, n = 4;
        double x = 2;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        System.out.println(sum);
    }
}
