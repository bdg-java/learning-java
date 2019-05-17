package com.bdg.Lesson_4;

public class App_253 {
    public static void main(String[] args) {

        int[] a = IntegerArrayoperations.getDefaultArray();
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        System.out.println(max);

        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println(min);
        System.out.println(min+max);
    }
}

