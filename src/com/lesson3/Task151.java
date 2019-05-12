package com.lesson3;

public class Task151 {
    public static void main(String[] args) {
        int n = 112, sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                sum += i;
        }
        System.out.println(sum);
    }

}
