package com.bdg.repetition.from291to300;

import java.util.Arrays;

public class Tasks291and294and297and300 {

    public static void main(String[] args) {

        int n = 10;
        int[] X = {0, -5, 28, -10, 9, -16, 0, 25, -7, 100};
        System.out.println("Array is " + Arrays.toString(X));

        //Tasks291and294and297and300
        int quantity = 0;

        for(int i = 0; i < X.length; i++){
            if(X[i] <= 0){
                quantity++;
            }
        }
        int[] Y = new int[quantity];
        int index = 0;

        for(int i = 0; i < X.length; i++){
            if(X[i] <= 0){
                Y[index] = X[i];
                index++;
            }
        }
        System.out.println("Array, vory stacvum e trvats Arrayic heracnelov drakan tarrery " + Arrays.toString(Y));

        //Task294
        quantity = 0;

        for(int i = 0; i < X.length; i++){
            if(i%2 == 0){
                quantity++;
            }
        }
        Y = new int[quantity];
        index = 0;

        for(int i = 0; i < X.length; i++){
            if(i%2 == 0){
                Y[index] = X[i];
                index++;
            }
        }
        System.out.println("Array, vory stacvum e trvats Arrayic heracnelov kent index unecogh tarrery " + Arrays.toString(Y));

        //Task297
        int k = 10;
        quantity = 0;

        for(int i = 0; i < X.length; i++){
            if(Math.abs(X[i]) <= k){
                quantity++;
            }
        }
        Y = new int[quantity];
        index = 0;

        for(int i = 0; i < X.length; i++){
            if(Math.abs(X[i]) <= k){
                Y[index] = X[i];
                index++;
            }
        }
        System.out.println("Array, vory stacvum e trvats Arrayic heracnelov 10ic mets bacardzak arzheq unecogh tarrery " + Arrays.toString(Y));

        //Task300
        k = 100;
        quantity = 0;

        for(int i = 0; i < X.length; i++){
            if(Math.pow(X[i],2) >= k){
                quantity++;
            }
        }
        Y = new int[quantity];
        index = 0;

        for(int i = 0; i < X.length; i++){
            if(Math.pow(X[i],2) >= k){
                Y[index] = X[i];
                index++;
            }
        }
        System.out.println("Array, vory stacvum e trvats Arrayic heracnelov ayn tarrery, voronc qarakusinery poqr en 100ic " + Arrays.toString(Y));
    }

}
