package com.algorithm;

import java.util.Arrays;

import static com.algorithm.RandomArray.getArray;

public class QuickSort {
    public static void main(String[] args) {
        int[] a = getArray();
        System.out.println(Arrays.toString(a));
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    public static void quickSort(int[] a, int first, int last) {
        int pivod = 0;
        int i = first;
        int j = last;
        while (i <= j) {

            pivod = first + (last - first) / 2;
            while (a[pivod] > a[i]) i++;
            while (a[pivod] < a[j]) j--;

            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (i < last) quickSort(a, i, last);
        if (j > first) quickSort(a, first, j);
    }

}
