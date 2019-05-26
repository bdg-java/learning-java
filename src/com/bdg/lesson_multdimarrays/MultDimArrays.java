package com.bdg.lesson_multdimarrays;

public class MultDimArrays {

    private static final int[][] DEFAULT_ARRAY = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
    };

    private static final int[][] DEFAULT_ARRAY2 = {
            { -1, 2, -3 },
            { 4, 5, 6 },
            { -7, 8, 9 }
    };

    private static final double[][] DEFAULT_DOUBLE_ARRAY = {
            { 1.2, 2.5, 3.6 },
            { 4.7, 5.8, 6.9 },
            { 7.3, 8.7, 9.5 }
    };

    public static int[][] getDefaultArray() {
        return DEFAULT_ARRAY;
    }

    public static int[][] getNegavtiveValueArray() {
        return DEFAULT_ARRAY2;
    }

    public static double[][] getDoubleArray() {
        return DEFAULT_DOUBLE_ARRAY;
    }
}
