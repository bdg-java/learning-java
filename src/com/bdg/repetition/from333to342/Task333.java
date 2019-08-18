package com.bdg.repetition.from333to342;

import java.util.Arrays;

public class Task333 {

    public static void main(String[] args) {

        int n = 10;
        int[] X = {0, -5, 28, -10, 9, -16, 0, 25, -7, 100};
        int k = 10;
        int sum = 0;

        System.out.println("Array is " + Arrays.toString(X));

        for(int i = 1; i < X.length-1; i++){
            if((X[i-1] + X[i+1])< k){
                sum += X[i];
            }
        }
        System.out.println(sum);
    }

}
