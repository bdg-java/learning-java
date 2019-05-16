package com.lesson4;

public class Task228 {
    public static void main(String[] args) {
        double sum = 0;
        int k = 3;
        int[] a = IntegerArrayoperations.getDefaultArray();
        for (int i = 0; i < a.length; i++) {
            if (i % k == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
