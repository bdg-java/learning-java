package com.lesson4;

public class Task227 {
    public static void main(String[] args) {
        double sum = 0;
        int c = 0;
        int k = 3;
        int[] a = IntegerArrayoperations.getDefaultArray();
        for (int i = 1; i < a.length; i++) {
            if (i % k == 0) {
                sum += a[i];
                c++;
            }
        }
        sum = sum / c;
        System.out.println(sum);
    }
}

