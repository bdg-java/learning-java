package com.lesson3;

public class Task155 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i <= 99; i++)
            if (i % 3 == 0)
                sum += i;
        System.out.println(sum);

    }
}
