package com.lesson3;

public class Task152 {
    public static void main(String[] args) {

        int n = 56, mul = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                mul *= i;
        }
        System.out.println(mul);
    }
}
