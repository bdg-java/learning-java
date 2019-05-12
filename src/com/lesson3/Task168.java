package com.lesson3;

public class Task168 {
    public static void main(String[] args) {
        boolean p = true;
        int n = 28;
        double s = Math.sqrt(n);
        for (int i = 2; i <= s; i++) {
            if (n % i == 0) {
                p = false;
                break;
            }
        }
        System.out.println(p);
    }
}
