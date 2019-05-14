package com.lesson3;

public class Task174 {
    public static void main(String[] args) {
        double x = 2;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(x);
            x = 2 + 1 / x;
        }

    }
}
