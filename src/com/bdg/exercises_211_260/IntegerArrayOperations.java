package com.bdg.exercises_211_260;


import java.util.Arrays;
import java.util.Random;

public class IntegerArrayOperations {

    private static final int[] DEFAULT_ARRAY = {905, 14, -3, 1000, 899, 100, 5, 49, -3, 9,2};

    public static int[] generateArrayWithRandomNumbers(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
        return array;
    }

    public static void displayArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static int[] getDefaultArray() {
        return DEFAULT_ARRAY;
    }
}