package com.lesson4;

public class Task248 {
    public static void main(String[] args) {
        int sum = 0;
        int k = 3;
        int[] a = IntegerArrayoperations.getDefaultArray();
        for (int i = 0; i < a.length; i++) {
            if (Math.pow((a[i] + i), 2) % k == 0) {
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}
