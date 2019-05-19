package com.lesson5;

import com.lesson4.IntegerArrayoperations;

import java.util.Arrays;

public class Task292 {
    public static void main(String[] args) {
        int[] a = IntegerArrayoperations.getDefaultArray();
        int j = 0;
        int c = GetIntegerArrayElMultipleSevenCount(a);
        int[] b = new int[c];
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 7 != 0) {
                b[j] = a[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(b));
    }

    public static int GetIntegerArrayElMultipleSevenCount(int a[]) {
        int c = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 7 != 0) {
                c++;
            }
        }
        return c;
    }
}
