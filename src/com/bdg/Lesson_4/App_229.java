package com.bdg.Lesson_4;

public class App_229 {

    public static void main(String[] args) {
        int num = 1;
        int[] a = IntegerArrayoperations.getDefaultArray();

        for (int i = 0; i < a.length; i++) {

            if (a[i] - i > 0 && a[i] != 0) {

                num *= a[i];
            }
        }
        System.out.println(num);
    }
}
