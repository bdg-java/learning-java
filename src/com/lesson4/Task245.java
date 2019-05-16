package com.lesson4;

public class Task245 {
    public static void main(String[] args) {
        int sum = 0;
        int[] a = IntegerArrayoperations.getDefaultArray();
        for (int i = 0; i < a.length; i++) {
            if ((a[i] + i) % 3 == 0) {
                sum += a[i] * a[i];
            }
        }
        System.out.println(sum);
    }
}
