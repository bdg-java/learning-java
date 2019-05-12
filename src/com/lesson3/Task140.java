package com.lesson3;

public class Task140 {
    public static void main(String[] args) {
        double y = 0, x = 2;
        for (int k = 2; k <= 10; k++) {
            if (x <= 3)
                y += x + Math.pow(k, 4);
            else if (x > 3 && x < 5)
                y += Math.pow(x, k + 6);
            else y += Math.pow(5, 6);
        }
        System.out.println(y);
    }
}
