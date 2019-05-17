package com.lesson4;

import java.util.Arrays;
import java.util.Random;

public class IntegerArrayoperations {
    private static final int[] def_array = {1, 9, -5, 10, -5, 12, 10, 12, 3, 4, 7, 0};


    public static void displayArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int[] getDefaultArray() {
        return def_array;
    }

    public static int[] generateArrayWithRandomNumbers(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
        return array;
    }

    public static int getMaxElementOfArray(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
        }
        return max;
    }

}
