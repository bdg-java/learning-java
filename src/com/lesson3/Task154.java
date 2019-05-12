package com.lesson3;

public class Task154 {
    public static void main(String[] args) {
        int n = 126, mul = 1;
        for (int i = 1; i <= n; i++) {
            if (n % i == 3)
                mul *= i;
        }
        System.out.println(mul);
    }
}
