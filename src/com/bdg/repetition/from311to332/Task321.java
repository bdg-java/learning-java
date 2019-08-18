package com.bdg.repetition.from311to332;

import java.util.Arrays;

public class Task321 {

    public static void main(String[] args) {

        int n = 10;
        int[] X = {0, -5, 28, -10, 9, -16, 0, 25, -7, 100};

        System.out.println("Array is " + Arrays.toString(X));

        int max = X[0];
        int indexMax = 0;

        for(int i = 1; i < X.length; i++){
            if(X[i] > max){
                max = X[i];
                indexMax = i;
            }
        }
        System.out.println("Max element is " + max);

        int quantity = 0;

        for(int i = 0; i < indexMax; i++){
            if(i%2 == 0){
                quantity++;
            }
        }

        int[] Y = new int[quantity];
        int index = 0;

        for(int i = 0; i < indexMax; i++){
            if(i%2 == 0){
                Y[index] = X[i] + max;
                index++;
            }
        }
        System.out.println("New array is " + Arrays.toString(Y));
    }

}
