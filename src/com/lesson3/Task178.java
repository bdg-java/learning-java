package com.lesson3;

public class Task178 {
    public static void main(String[] args) {
        int n = 7, x1 = 1, x2 = 2, x3 = 3;
        System.out.println("1 : " + x1 + "\n" + "2 : " + x2 + "\n" + "3 : " + x3);
        for (int k = 4; k <= n; k++) {
            int x4 = x3 + x2 - 2 * x1;
            System.out.println(k + " : " + x4);
            x1 = x2;
            x2 = x3;
            x3 = x4;

        }
    }
}
