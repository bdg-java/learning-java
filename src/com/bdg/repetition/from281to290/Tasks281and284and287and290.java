package com.bdg.repetition.from281to290;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tasks281and284and287and290 {

    public static void main(String[] args) {

        int n = 10;
        int[] X = {0, -5, 28, -10, 9, -16, 0, 25, -7, 100};
        System.out.println("Array is " + Arrays.toString(X));

        //Task 281
        int quantity = 0;

        for(int i = 0; i < X.length; i++){
            if(X[i] > 0){
                quantity++;
            }
        }

        int[] Y = new int[quantity];
        int index = 0;

        for(int i = 0; i < X.length; i++){
            if(X[i] > 0){
                Y[index] = X[i];
                index++;
            }
        }
        System.out.println("Drakan tarreric baghkacats Array " + Arrays.toString(Y));

        //Task 284
        int a = -6;
        int b = 10;
        quantity = 0;
        index = 0;

        for(int i = 0; i < X.length; i++){
            if(X[i] >= a && X[i] <= b){
                quantity++;
            }
        }
        int[]Z = new int[quantity];

        for(int i = 0; i < X.length; i++){
            if(X[i] >= a && X[i] <= b){
                Z[index] = X[i];
                index++;
            }
        }
        System.out.println("[-6,10] mijakayqin patkanogh tarreric baghkacats Array " + Arrays.toString(Z));

        //Task287
        quantity = 0;
        index = 0;

        for(int i = 0; i < X.length; i++){
            if(X[i] != i){
                quantity++;
            }
        }

        int[] W = new int[quantity];

        for(int i = 0; i < X.length; i++){
            if(X[i] != i){
                W[index] = X[i];
                index++;
            }
        }
        System.out.println("Indexic tarbervogh arzheq unecogh tarreric baghkacats Array " + Arrays.toString(W));

        //Task290
        quantity = 0;
        index = 0;

        for(int i = 0; i < X.length; i++){
            if(X[i]%6 == 1){
                quantity++;
            }
        }

        int[] A = new int[quantity];

        for(int i = 0; i < X.length; i++){
            if(X[i]%6 == 1){
                A[index] = X[i];
                index++;
            }
        }
        System.out.println("6i bazhanelis mnacordum 1 stacogh tarreric baghkacats Array " + Arrays.toString(A));

    }

}
