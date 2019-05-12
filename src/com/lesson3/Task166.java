package com.lesson3;

public class Task166 {
    public static void main(String[] args) {
        short y = 0;
        int n = 16;
        double s = Math.sqrt(n);
        for (int i = 1; i <= s; i++) {
            if (n == Math.pow(4, i)) {
                y = 1;
                break;
            }
        }
        System.out.println(y);
    }
}
