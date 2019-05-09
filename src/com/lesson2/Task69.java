package com.lesson2;

public class Task69 {
    public static void main(String[] args) {
        int a = 1759;
        short y = 0;
        if (a % 10 + a % 100 / 10 + a / 1000 + a / 100 % 10 > 20)
            y = 1;
        else y = 0;
        System.out.print(y);
    }
}
