package com.lesson3;

public class Task189 {
    public static void main(String[] args) {
        int n = 34;
        int x1 = 1, x2 = 1, fib = 0;
        if (x1 > n)
            fib = x1;
        else
            for (int i = 3; i <= n; i++) {
                fib = x1 + x2;
                if (fib > n)
                    break;
                else {
                    x1 = x2;
                    x2 = fib;
                }
            }
        System.out.println(fib);
    }
}
