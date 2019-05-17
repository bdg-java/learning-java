package com.bdg.lesson_Arrays;

import java.util.Arrays;
import java.util.Random;

public class IntegerArrayOperations {

    private static final int[] DEFAULT_ARRAY = {12, 5, -3, 7, 56, 100, 5, 7, 0, -63};
    private static final int[] ONE_DIGIT_NUMBER_ARRAY = {1, 2, 3, 4, 5, 6, 7};

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

    public static int[] getOneDigitNumberArray() {return ONE_DIGIT_NUMBER_ARRAY; }
}

