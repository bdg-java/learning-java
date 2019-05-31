package com.bdg.Lesson_4;

public class App_242 {
    public static void main(String[] args) {

        int t= 5;
        int sum = 0;
        int[] a = IntegerArrayoperations.getDefaultArray();

        for (int i = 0; i < a.length; i++) {
            if (a[i] % t == 0 && a[i] != 0) {
                System.out.println(a[i]);
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}


