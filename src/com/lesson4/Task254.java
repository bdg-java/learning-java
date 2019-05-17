package com.lesson4;

public class Task254 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
            if (a[i] > max)
                max = a[i];
        }
        System.out.println(max * min);
    }
}
