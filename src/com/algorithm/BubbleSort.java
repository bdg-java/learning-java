package com.algorithm;

import java.util.Arrays;

import static com.algorithm.RandomArray.getArray;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = getArray();
        System.out.println(Arrays.toString(a));
        int len = a.length;
        int temp = 0;
        for (int i = 0; i < len; i++)
            for (int j = 0; j < len - i - 1; j++) {
                if (a[j + 1] < a[j]) {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        System.out.println(Arrays.toString(a));
    }
}
