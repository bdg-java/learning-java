package com.bdg.Lesson_4;

public class App_238 {
    public static void main(String[] args) {

        int sum = 0;
        int[] a = IntegerArrayoperations.getDefaultArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0 && a[i] != 0) {
                System.out.println(a[i]);
                sum += a[i];
            }
        }
        System.out.println(sum);
    }
}

