package com.bdg.Homework;

import java.util.Arrays;

public class App_287 {
    public static void main(String[] args) {


        int count = 0;
        int index = 0;
        int[] X = {1, 44, -18, 444, 25, -7, 10, 23, -2, 11};
        System.out.println(Arrays.toString(X));


        count = 0;
        index = 0;

        for (int i = 0; i < X.length; i++) {
            if (X[i] != i) {
                count++;
            }
        }

        int[] W = new int[count];

        for (int i = 0; i < X.length; i++) {
            if (X[i] != i) {
                W[index] = X[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(W));
    }
}