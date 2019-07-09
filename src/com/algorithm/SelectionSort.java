package com.algorithm;

import java.util.Arrays;

import static com.algorithm.RandomArray.getArray;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = getArray();
        System.out.println(Arrays.toString(a));
        int len = a.length;
        int temp = 0;
        int min;

        for (int i = 0; i < len - 1; i++) {
            min = i;
            for (int j = i + 1; j < len; j++) {
                if (a[j] < a[min])
                    min = j;
            }
            temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}
