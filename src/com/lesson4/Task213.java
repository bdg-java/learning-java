package com.lesson4;

public class Task213 {
    public static void main(String[] args) {
        double sum = 0;
        int[] a = IntegerArrayoperations.getDefaultArray();
        int i = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] < 0)
                sum += a[i] * a[i];
        }
        sum = Math.sqrt(sum / i);
        System.out.println(sum);
    }

}
