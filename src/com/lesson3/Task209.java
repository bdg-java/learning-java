package com.lesson3;

public class Task209 {
    public static void main(String[] args) {
        int a = 23266684;
        boolean t = false;
        while (a > 0) {
            if (((a % 10) & 1) != 0) {
                t = true;
                break;
            }
            a = a / 10;
        }
        System.out.println(t);
    }
}
