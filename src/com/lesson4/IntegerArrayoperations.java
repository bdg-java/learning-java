package com.lesson4;

import java.util.Arrays;
import java.util.Random;

public class IntegerArrayoperations {
    private static final int[] def_array = {1, 9, -5, 10, -5, 12, 10, 3, 4, 7, 0};


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

}
