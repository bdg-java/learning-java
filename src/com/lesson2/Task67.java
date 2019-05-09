package com.lesson2;

public class Task67 {
    public static void main(String[] args) {
        int a = 1232;
        int sum = a % 10 + a % 100 / 10 + a / 1000 + a / 100 % 10;
        if (a == (int) Math.pow(sum, 2))
            System.out.print("YES");
        else
            System.out.print("NO");

    }
}
