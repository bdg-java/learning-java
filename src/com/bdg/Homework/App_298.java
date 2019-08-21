package com.bdg.Homework;

import java.util.Arrays;

public class App_298 {
    public static void main(String[] args) {


        int count = 0;
        int index = 0;
        int[] X = {1, 44, -18, 444, 25, -7, 10, 23, -2, 11 };
        System.out.println( Arrays.toString(X));



        for (int i = 0; i < X.length; i++) {
            if (X[i] %2 == 0) {
                count++;
            }
        }
        int[] Y = new int[count];


        for(int i = 0; i < X.length; i++){
            if(X[i] % 2 == 0){
                Y[index] = X[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(Y));

    }
}
