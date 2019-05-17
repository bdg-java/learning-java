package com.lesson4;

public class Task251 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println(max);
    }
}
