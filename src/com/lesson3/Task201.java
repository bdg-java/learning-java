package com.lesson3;

public class Task201 {
    public static void main(String[] args) {
        int a = 2305, k = 0;
        while (a > 0) {
            a = a / 10;
            k++;
        }
        System.out.println(k);
    }
}
