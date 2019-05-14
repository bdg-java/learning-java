package com.lesson3;

public class Task180 {
    public static void main(String[] args) {
        int n = 81;
        while (n >= 1 && n % 3 == 0) {
            n = n / 3;
        }
        if (n == 1)
            System.out.println("True");
        else System.out.println("False");
    }
}
