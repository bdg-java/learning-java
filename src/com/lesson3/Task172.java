package com.lesson3;

public class Task172 {
    public static void main(String[] args) {
        int n = 6;
        long result = 1;
        while (n >= 1) {
            result *= n;
            n = n - 2;
        }
        System.out.println(result);
    }
}
