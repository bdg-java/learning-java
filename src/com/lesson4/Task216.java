package com.lesson4;

public class Task216 {
    public static void main(String[] args) {
        int mul = 1;
        int[] a = IntegerArrayoperations.getDefaultArray();
        int i = 0;
        for (i = 0; i < a.length; i += 2) {
                mul *= a[i];
        }
        System.out.println(mul);
    }
}
