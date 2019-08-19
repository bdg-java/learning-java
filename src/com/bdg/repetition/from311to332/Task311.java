package com.bdg.repetition.from311to332;

import java.util.Arrays;

public class Task311 {

    public static void main(String[] args) {

        int n = 10;
        int[] X = {1000, -5, 28, -10, 9, -16, 0, 25, -7, 100};

        System.out.println("Array is " + Arrays.toString(X));

        int quantity = 0;
        int max = X[0];

        for(int i = 0; i < X.length; i++){
            if(X[i] > 0){
                quantity++;
            }
            if(X[i] > max){
                max = X[i];
            }
        }

        int[] Y = new int[quantity];
        int index = 0;

        for(int i = 0; i < X.length; i++){
            if(X[i] > 0){
                Y[index] = X[i]*max;
                index++;
            }
        }
        System.out.println(Arrays.toString(Y));
    }

}
