package com.lesson3;

public class Task164 {
    public static void main(String[] args) {
        int min = -1, n = 23;

        for (int i = 100; i <= 999; i++) {
            if (Math.sqrt(i) > n) {
                min = i;
                break;
            }
        }
        System.out.println(min);
    }
}
