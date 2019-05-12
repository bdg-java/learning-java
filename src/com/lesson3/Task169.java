package com.lesson3;

public class Task169 {
    public static void main(String[] args) {
        int x = 5, y = 11, z = 0;
        int n = x + y;
        double s = Math.sqrt(n);
        for (int i = 2; i <= s; i++) {
            if (n % i == 0) {
                z = 6;
                break;
            } else z = 5;
        }
        System.out.println(z);
    }
}
