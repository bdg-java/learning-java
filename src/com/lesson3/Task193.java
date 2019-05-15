package com.lesson3;

public class Task193 {
    public static void main(String[] args) {
        int n = 3, t = 1;
        double sum = 0;
        for (int i = 1; i <= 4; i++) {
            t = i * t;
            sum += t;
        }
        System.out.println(sum);
    }
}
