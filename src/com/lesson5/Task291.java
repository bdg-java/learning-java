package com.lesson5;

import com.lesson4.IntegerArrayoperations;

import java.util.Arrays;

public class Task291 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();

        int j = 0;
        int c = GetIntegerArrayPositiveElCount(a);
        int[] b = new int[c];
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                b[j] = a[i];
                j++;
            }

        }
        System.out.println(Arrays.toString(b));
    }

    public static int GetIntegerArrayPositiveElCount(int a[]) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= 0) {
                c++;
            }
        }
        return c;
    }

}
