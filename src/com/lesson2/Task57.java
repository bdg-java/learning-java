package com.lesson2;

public class Task57 {
    public static void main(String[] args) {
        int a = 327;
        if (a > 300)
            System.out.print((float)(a / 10 % 10) / (a % 10));
        else
            System.out.print((float)(a / 100) / (a % 10));


    }
}
