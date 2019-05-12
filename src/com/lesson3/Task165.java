package com.lesson3;

public class Task165 {
    public static void main(String[] args) {
        boolean t = false;
        int n = 81;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n == Math.pow(3, i)) {
                t = true;
                break;
            }
        }
        System.out.println(t);
    }
}
