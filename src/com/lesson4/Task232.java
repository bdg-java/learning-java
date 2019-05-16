package com.lesson4;

public class Task232 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] & 1) == 0)
                c++;
        }
        System.out.println(c);
    }
}
