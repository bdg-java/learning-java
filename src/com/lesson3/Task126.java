package com.lesson3;

public class Task126 {
    public static void main(String[] args) {
        double sum = 0, x, y;
        for (int i = 1; i <= 16; i++) {
            if (i % 5 == 0)
                x = i;
            else x = 0;
            if (i % 7 == 0)
                y = i * 2;
            else y = i;
            sum += x - y;
        }
        System.out.println(sum);
    }
}
