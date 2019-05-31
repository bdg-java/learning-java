package com.bdg.Lesson_4;

public class App_255 {
    public static void main(String[] args) {

    int z =0;
    int[] a = IntegerArrayoperations.getDefaultArray();
    int max = a[0];
        for (int i = 1; i < a.length; i++) {
        if (a[i] > max)
            max = a[i];
            z +=1;
        }
        System.out.println(max+z);
    }
}

