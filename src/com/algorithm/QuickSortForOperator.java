package com.algorithm;

import java.util.Arrays;

import static com.algorithm.RandomArray.getArray;

public class QuickSortForOperator {
    public static void main(String[] args) {
        int[] a = getArray();
        System.out.println(Arrays.toString(a));
        quickSort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

    }

    public static void quickSort(int[] a, int first, int last) {
        int i;
        if (first < last) {
            i = partition(a, first, last);
            quickSort(a, first, i - 1);
            quickSort(a, i + 1, last);
        }
    }


    public static int partition(int[] a, int first, int last) {
        int temp;
        int pivod = a[last];
        int i = first - 1;
        for (int j = first; j <= last - 1; j++) {
            if (a[j] <= pivod) {
                i++;
                temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }

        }
        temp = a[i + 1];
        a[i + 1] = a[last];
        a[last] = temp;
        return i + 1;
    }
}
