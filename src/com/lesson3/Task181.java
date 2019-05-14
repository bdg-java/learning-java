package com.lesson3;

public class Task181 {
    public static void main(String[] args) {
        int n = 64, i;
        int k = 0;
        for (i = 1; i < n; i = i * 2)
            k++;
        if (n == i)
            System.out.println(k);

    }
}
