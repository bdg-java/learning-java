package com.lesson3;

public class Task157 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 100; i <= 999; i++)
            if (i % 5 != 0)
                sum += i;
        System.out.println(sum);
    }
}
