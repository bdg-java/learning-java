package com.lesson3;

public class Task145 {
    public static void main(String[] args) {
        double sum = 0, mul = 1, c = 5;
        for (int i = 1; i <= 7; i++) {
            for (int k = 1; k <= 8; k++)
                mul *= i * i + c * k;
            sum += mul;
        }
        System.out.println(sum);
    }
}
