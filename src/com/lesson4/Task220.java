package com.lesson4;

public class Task220 {
    public static void main(String[] args) {
        int c = 0;
        int k = 10;
        int[] a = IntegerArrayoperations.getDefaultArray();
        for (int i = 1; i < a.length; i++) {
            if (a[i] > 0 || a[i] < 0)
                c++;
        }
        System.out.println(c);
    }
}
