package com.lesson3;

public class Task202 {
    public static void main(String[] args) {
        int a = 23107, sum = 0;
        while (a > 0) {
            sum += a % 10;
            a = a / 10;
        }
        System.out.println(sum);
    }
}
