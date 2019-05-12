package com.lesson3;

public class Task171 {
    public static void main(String[] args) {
        int n = 10;
        long fact = 1;
        while (n > 0) {
            fact *= n;
            n--;
        }
        System.out.println(fact);
    }
}
