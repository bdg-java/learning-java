package com.lesson2;

public class Task63 {
    public static void main(String[] args) {
        int a = 2230;
        if (a % 10 == 1 || a % 100 / 10 == 1 || a / 1000 == 1 || a / 100 % 10 == 1)
            System.out.print(1);
        else System.out.print(0);

    }
}
