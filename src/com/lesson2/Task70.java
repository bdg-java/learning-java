package com.lesson2;

public class Task70 {
    public static void main(String[] args) {
        int a = 1751;
        short y = 0;
        if ((a % 10) * (a % 100 / 10) * (a / 1000) * (a / 100 % 10) > 200)
            y = 0;
        else y = 1;
        System.out.print(y);
    }
}
