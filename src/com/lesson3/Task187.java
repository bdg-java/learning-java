package com.lesson3;

public class Task187 {
    public static void main(String[] args) {
        int n = 167;
        boolean t = false;
        int s = (int) Math.sqrt(n);
        for (int i = 2; i <= s; i++) {
            if (n % i == 0) {
                t = false;
                break;
            } else t = true;
        }
        System.out.println(t);
    }
}
