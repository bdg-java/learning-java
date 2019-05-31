package com.bdg.Lesson_4;

public class App_236 {

    public static void main(String[] args) {

        int[] a = IntegerArrayoperations.getDefaultArray();
        int sum = 0;
        int sum_1 = 1;

        for (int i = 1; i < a.length; i++) {
            if ((a[i] & 1) != 0 && a[i] != 0) {
                System.out.println(a[i]);
                sum += a[i];
                sum_1 *= a[i];
            }
        }
        System.out.println(sum);
        System.out.println(sum_1);
    }
}