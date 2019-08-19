package com.bdg.repetition.from333to342;

import java.util.Arrays;

public class Task336 {

    public static void main(String[] args) {

        int n = 10;
        int[] X = {0, 5, 28, 10, 9, -16, 0, 25, -7, 100};

        System.out.println("Array is " + Arrays.toString(X));

        int max = X[0];
        boolean negative = false;

        for(int i = 0; i < X.length; i++) {
            if(X[i] > max){
                max = X[i];
            }
            if(X[i] < 0){
                negative = true;
            }
        }

        if(negative == true){
            System.out.println("Max element is " + max);
        } else{
            System.out.println("s = 0");
        }

    }

}
