package com.lesson3;

public class Task175 {
    public static void main(String[] args) {
        double x = 1;
        int n = 10;
        for (int k = 1; k <= n; k++) {
            System.out.println(x);
            x = (x + 1) / k;
        }
    }
}
