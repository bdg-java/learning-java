package com.bdg.repetition.from311to332;

import java.util.Arrays;

public class Task326 {

    public static void main(String[] args) {

        int n = 10;
        int[] X = {0, -5, 28, -10, 9, 1 , -16, 0, 25, -7, 100};

        System.out.println("Array is " + Arrays.toString(X));

        int[] Y = new int[X.length];

        for(int i = 0; i < X.length/2; i++){
            Y[i] = X[X.length-1-i];
            Y[X.length-1-i] = X[i];
            if(X.length%2 != 0){
                Y[(int)X.length/2] = X[(int)X.length/2];
            }
        }
        System.out.println("New array is " + Arrays.toString(Y));
    }

}
