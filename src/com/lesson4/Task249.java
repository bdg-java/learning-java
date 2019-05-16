package com.lesson4;

public class Task249 {
    public static void main(String[] args) {
        int c = 0;
        int k = 8;
        int[] a = IntegerArrayoperations.getDefaultArray();
        for (int i = 0; i < a.length; i++) {
            if (Math.abs(a[i] - i) > k)
                c++;
        }
        System.out.println(c);
    }
}
