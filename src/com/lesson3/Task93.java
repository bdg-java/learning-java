package com.lesson3;

public class Task93 {
    public static void main(String[] args) {
        double x = 0.5, n = 10, mul = 1;
        for (int i = 5; i <= n; i++) {
            mul = mul * (Math.pow(x, 2) + x);
            x = Math.atan(x + 2);
        }
        System.out.println(mul);
    }
}
