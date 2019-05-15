package com.lesson3;

public class Task206 {
    public static void main(String[] args) {
        int a = 2356101;
        int b = a;
        int k = -1;
        while (b > 0) {
            b = b / 10;
            k++;
        }
        while (k >= 0) {
            int s = (int) Math.pow(10, k);
            b += (a % 10) * s;
            a = a / 10;
            k--;
        }
        System.out.println(b);
    }
}
