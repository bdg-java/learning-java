package com.lesson3;

public class Task159 {
    public static void main(String[] args) {
        long mul = 1;
        for (int i = 100; i <= 999; i++)
            if (i % 3 == 1 && i % 4 == 2) {
                mul *= i;
            }
        System.out.println(mul);
    }
}
