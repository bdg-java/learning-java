package com.bdg.repetition.from311to332;

import java.util.Arrays;

public class Task316 {

    public static void main(String[] args) {

        int n = 10;
        int[] X = {0, -5, 28, -10, 9, -16, 0, 25, -7, 100};

        System.out.println("Array is " + Arrays.toString(X));

        int max = X[0];
        int min = X[0];
        int quantity = 0;

        for(int i = 0; i < X.length; i++){
            if(X[i] > max){
                max = X[i];
            }
            if(X[i] < min){
                min = X[i];
            }
        }

        System.out.println("Max element is " + max + ", Min element is " + min);

        for(int i = 0; i < X.length; i++){
            if(Math.abs(X[i]) < (max + min)/2){
                quantity++;
            }
        }

        int[] Y = new int[quantity];
        int index = 0;

        for(int i = 0; i < X.length; i++){
            if(Math.abs(X[i]) < (max + min)/2){
                Y[index] = X[i];
                index++;
            }
        }
        System.out.println("Max ev Min tarreri mijin tvabanakanic poqr bacardzak arzheq unecogh tarreric baghkacats Array " + Arrays.toString(Y));
    }

}
