package com.lesson2;

public class Task62 {
    public static void main(String[] args) {
        int a = 5567;
        if (a < 5000)
            System.out.print((float) a / (a % 10 + a / 100 % 10));
        else System.out.print((float) a / (a % 100 / 10 + a / 1000));
    }
}
