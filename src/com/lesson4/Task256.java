package com.lesson4;

public class Task256 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int min = a[0];
        int minpos = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                minpos = i;
            }
        }
        System.out.println(min + minpos);
    }
}
