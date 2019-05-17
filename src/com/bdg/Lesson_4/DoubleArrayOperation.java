package com.bdg.Lesson_4;

import java.util.Arrays;

public class DoubleArrayOperation {
    private static final double[] def_array = {1.5, 9, -5, 10.2, -5.1, 2, 0, 3.9};


    public static void displayArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static double[] getDefaultArray() {
        return def_array;
    }

}