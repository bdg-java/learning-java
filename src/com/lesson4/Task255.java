package com.lesson4;

public class Task255 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int max = a[0];
        int maxpos = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxpos = i;
            }
        }
        System.out.println(max + maxpos);
    }
}
