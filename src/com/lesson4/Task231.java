package com.lesson4;

public class Task231 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] & 1) == 0)
                sum += a[i] * a[i];
        }
        System.out.println(sum);
    }
}
