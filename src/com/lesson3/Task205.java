package com.lesson3;

public class Task205 {
    public static void main(String[] args) {
        int a = 23101565;
        int b = a;
        int k = -1;
        while (b > 0) {
            b = b / 10;
            k++;
        }
        while (k >= 0) {
            int s = (int) Math.pow(10, k);
            System.out.print(a / s);
            a = a % s;
            k--;
        }
    }
}
