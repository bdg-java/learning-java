package com.bdg.algorithms;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] array = {3, 423, 1, 8, 9,89,4324,0,7,4};
        System.out.println(Arrays.toString(sort(array)));
    }


    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    minIndex = j;
                    int tmp = arr[i];
                    arr[i] = arr[minIndex];
                    arr[j] = tmp;
                }
            }
        }
        return arr;

    }
}
