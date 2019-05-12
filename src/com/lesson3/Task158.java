package com.lesson3;

public class Task158 {
    public static void main(String[] args) {
        long mul = 1;
        for (int i = 100; i <= 999; i++)
            if (i % 3 != 0 && i % 2 != 0)
                mul *= i;
        System.out.println(mul);
    }
}
