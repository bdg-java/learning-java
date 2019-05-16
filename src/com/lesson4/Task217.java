package com.lesson4;

public class Task217 {
    public static void main(String[] args) {
        int mul = 1;
        int[] a = IntegerArrayoperations.getDefaultArray();
        int i = 0;
        for (i = 1; i < a.length; i += 2) {
            mul *= a[i] * a[i];
        }
        System.out.println(mul);
    }
}
