package com.lesson5;

import com.lesson4.IntegerArrayoperations;

import java.util.Arrays;

public class Task300 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int j = 0;
        int k = 5;
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if ((a[i] * a[i]) >= k) {
                c++;
            }
        }
        int[] b = new int[c];
        for (int i = 0; i < a.length; i++) {
            if ((a[i] * a[i]) >= k) {
                b[j] = a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
