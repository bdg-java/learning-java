package com.bdg.exercises_421_440;

import java.util.Random;

public class TwoDimensionalArrays {
    private final static int[][] defaultArray = {
            {1, 0, 0},
            {4, 5, 6},
            {7, 10, 9}};
    private final static double[][] defaultDoubleArray = {
            {1.0, 5.3, 4.5},
            {5.9, 5.3, 6.4},
            {7.0, 10, 9}};

    public static int[][]

    getDefaultArray() {
        return defaultArray;
    }

    public static double[][] getDefaultDoubleArray() {
        return defaultDoubleArray;
    }


    public static int[][] arrayByGivenSizes(int n,int m)
    {
        int[][] array = new int[n][m];
        for(int i =0;i<n;i++){
            for (int j=0;j<m;j++){
                array[i][j] = new Random().nextInt(100);

            }
        }
        return array;
    }
}
