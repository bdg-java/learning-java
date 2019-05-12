package com.lesson3;

public class Task170 {
    public static void main(String[] args) {
        int n = 1598;
        double result = 0;
        int s = (int) Math.sqrt(n) + 1;
        for (int i = 1; i <= s; i++) {
            if (Math.pow(2, i) > n) {
                result = Math.pow(2, i);
                break;
            }
        }
        System.out.println(result);
    }
}
