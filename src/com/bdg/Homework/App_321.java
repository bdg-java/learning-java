package com.bdg.Homework;

import java.util.Arrays;

public class App_321 {
    public static void main(String[] args) {

        int[] X = {11, 32, -62, 7, -5, 12, 44, 78, -55, 12};
        int max = X[0];
        int indexMax = 0;

        for (int i = 1; i < X.length; i++) {
            if (X[i] > max) {
                max = X[i];
                indexMax = i;
            }
        }
        System.out.println(Arrays.toString(X));

        int count = 0;

        for (int i = 0; i < indexMax; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }

        int[] Y = new int[count];
        int index = 0;

        for (int i = 0; i < indexMax; i++) {
            if (i % 2 == 0) {
                Y[index] = X[i] + max;
                index++;
            }
        }
        System.out.println(Arrays.toString(Y));
    }
}

