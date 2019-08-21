package com.bdg.Homework;

import java.util.Arrays;

public class App_311 {
    public static void main(String[] args) {


        int n = 10;
        int index = 0;
        int count = 0;
        int[] X = {11, 32, -62, 7, -5, 12, 44, 78, -55, 12};
        int max = X[0];

        System.out.println(Arrays.toString(X));

        for (int i = 0; i < X.length; i++) {
            if (X[i] > 0) {
                count++;
            }
            if (X[i] > max) {
                max = X[i];
            }
        }

        int[] Y = new int[count];

        for (int i = 0; i < X.length; i++) {
            if (X[i] > 0) {
                Y[index] = X[i] + max;
                index++;
            }
        }
        System.out.println(Arrays.toString(Y));
    }
}

