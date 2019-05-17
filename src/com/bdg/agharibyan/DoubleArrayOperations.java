package com.bdg.agharibyan;


import java.util.Arrays;
import java.util.Random;

public class DoubleArrayOperations {

    private static final double[] DEFAULT_ARRAY = {12.3, 5, -3.3, 7, 56, 100.6, 5, 7, -63, 0};

    public static double[] generateArrayWithRandomNumbers(int size) {
        double[] array = new double[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(100);
        }
        return array;
    }

    public static void displayArray(double[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static double[] getDefaultArray() {
        return DEFAULT_ARRAY;
    }
}
