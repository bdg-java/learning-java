package com.lesson3;

public class Task208 {
    public static void main(String[] args) {
        int a = 5655;
        boolean t = true;
        int p = a % 10;
        a = a / 10;
        while (a > 0) {
            if (a % 10 != p) {
                t = false;
                break;
            }
            a = a / 10;
        }
        System.out.println(t);
    }
}
