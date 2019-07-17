package com.bdg.Algorithm_Types;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {


        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i = left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
        }
        System.out.println(Arrays.toString(array));

    }

    private static void swap(int[] array, int left, int minInd) {
        int tmp = array[left];
        array[left] = array[minInd];
        array[minInd] = tmp;
    }
}
