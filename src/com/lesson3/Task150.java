package com.lesson3;

public class Task150 {
    public static void main(String[] args) {
        double mul = 1, sum = 0, b = 5;
        for (int k = 1; k <= 10; k++) {
            for (int j = 1; j <= 8; j++)
                sum += Math.atan(b * k + j * j);
            mul *= (k + 1) * sum;
        }
        System.out.println(mul);
    }
}
