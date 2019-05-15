package com.lesson3;

public class Task210 {
    public static void main(String[] args) {
        int a = 23006101, sum1 = 0, sum2 = 0;
        while (a > 0) {
            sum1 += a % 10;
            a = a / 10;
            sum2 += a % 10;
            a = a / 10;
        }
        if (sum1 == sum2)
            System.out.println("true");
        else
            System.out.println("false");
    }
}
