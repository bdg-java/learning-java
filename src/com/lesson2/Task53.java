package com.lesson2;

public class Task53 {
    public static void main(String[] args) {
        int a = 128, k = 250, sum = 0;
        sum = a % 10 +  a / 100 +  a/ 10 % 10;
        if (a > k)
            System.out.print ( "a > k " + (float)a/sum);
        else System.out.print ( "a <= k " + (float)a %10 /a);
    }
}
