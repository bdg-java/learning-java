package com.lesson3;

public class Task156 {
    public static void main(String[] args) {
        long mul = 1;
        for (int i = 10; i <= 99; i++)
            if (i % 3 == 0 && i % 5 == 0)
                mul *= i;
        System.out.println(mul);
    }
}
