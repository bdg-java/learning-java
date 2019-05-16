package com.lesson4;

public class Task246 {
    public static void main(String[] args) {
        double sum = 0;
        int c = 0;
        double s = 0;
        int[] a = IntegerArrayoperations.getDefaultArray();
        for (int i = 1; i < a.length; i++) {
            s = Math.sqrt(i);
            if (s == (int) s) {
                sum += a[i];
                c++;
            }
        }
        System.out.println(sum / c);
    }
}
