package com.bdg.Lesson_4;

public class App_252 {

    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < min)
                min = a[i];
        }
        System.out.println(min);
    }
}