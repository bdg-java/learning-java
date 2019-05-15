package com.lesson3;

public class Task203 {
    public static void main(String[] args) {
        int a = 23101, mul = 1, m;
        while (a > 0) {
            m = a % 10;
            mul *= m == 0 ? 1 : m;
            a = a / 10;
        }
        System.out.println(mul);
    }
}
