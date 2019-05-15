package com.lesson3;

public class Task188 {
    public static void main(String[] args) {
        int n = 6;
        int x1 = 1, x2 = 1;
        boolean t = false;
        if (n == x1 || n == x1 + x2)
            t = true;
        else
            for (int i = 3; i <= n; i++) {
                int x3 = x1 + x2;
                if (n == x3) {
                    t = true;
                    break;
                } else {
                    x1 = x2;
                    x2 = x3;
                }
            }
        System.out.println(t);
    }
}
