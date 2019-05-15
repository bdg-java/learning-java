package com.lesson3;

public class Task190 {
    public static void main(String[] args) {
        double x1 = 1, x2 = 2, e = 0.56, k = 0;
        if ((x2 - x1) < e) k = 2;
        else
            for (k = 3; k < e; k++) {
                double x3 = (x1 + 2 * x2) / 3;
                if ((x3 - x2) < e)
                    break;
                else {
                    x1 = x2;
                    x2 = x3;
                }
            }
        System.out.println(k);
    }
}
