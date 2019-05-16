package com.lesson4;

public class Task239 {
    public static void main(String[] args) {
        double sum = 0;
        int c = 0;
        int[] a = IntegerArrayoperations.getDefaultArray();
        for (int i = 0; i < a.length; i++)
            if (a[i] % 5 == 0 && a[i] != 0) {
                sum += a[i] * a[i];
                c++;
            }
        sum = Math.sqrt(sum / c);
        System.out.println(sum);
    }
}
