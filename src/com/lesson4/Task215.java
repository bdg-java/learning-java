package com.lesson4;

public class Task215 {
    public static void main(String[] args) {
        double sum = 0;
        int[] a = IntegerArrayoperations.getDefaultArray();
        int i = 0;
        for (i = 0; i < a.length; i += 2) {
                sum += a[i];
        }
        System.out.println(sum);
    }
}
