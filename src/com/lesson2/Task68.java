package com.lesson2;

public class Task68 {
    public static void main(String[] args) {
        int a = 6587;
        if ((a % 10) > (a % 100 / 10))
            System.out.print((a % 100) * (a / 100 % 10));
        else
            System.out.print(1);

    }
}
