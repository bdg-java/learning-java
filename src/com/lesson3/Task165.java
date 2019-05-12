package com.lesson3;

public class Task165 {
    public static void main(String[] args) {
        boolean t = false;
        int n = 81;
        double s = Math.sqrt(n);
        for (int i = 1; i <= s; i++) {
            if (n == Math.pow(3, i)) {
                t = true;
                break;
            }
        }
        System.out.println(t);
    }
}
