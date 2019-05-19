package com.lesson5;

import com.lesson4.IntegerArrayoperations;

import java.util.Arrays;

public class Task294 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int j = 0;
        int c = 0;
        for (int i = 0; i < a.length; i += 2) {
            c++;
        }

        int[] b = new int[c];
        for (int k = 0; k < a.length; k += 2) {
            b[j] = a[k];
            j++;
        }
        System.out.println(Arrays.toString(b));
    }
}

