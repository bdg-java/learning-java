package com.lesson3;

public class Task192 {
    public static void main(String[] args) {
        int n = 5;
        double sum = 0, x = 2;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(-1, i) * Math.pow(x, i);
        }
        System.out.println(sum);
    }
}
