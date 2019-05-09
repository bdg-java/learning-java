package com.lesson2;

public class Task64 {
    public static void main(String[] args) {
        int a = 4114;
        char y;
        if (a % 10 + a % 100 / 10 == 5)
            y = 's';
        else y = 'd';
        System.out.print(y);
    }
}
