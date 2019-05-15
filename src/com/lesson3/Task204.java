package com.lesson3;

public class Task204 {
    public static void main(String[] args) {
        int a = 23101;
        while (a > 0) {
            System.out.print(a % 10);
            a = a / 10;
        }
    }
}
