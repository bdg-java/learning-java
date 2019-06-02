package com.bdg;

import java.util.Arrays;

public class App_457 {

    public static void main(String[] args) {

        int matrix [] [] = new int [] [] {

                {1, 2, -3, 4, -3},
                {1, -1, 3, 4, 5},
                {1, -1, 3, -5, 5},
                {1, 2, 3, -2, 5},
                {5, -5, 3, 0, 1}};

        int m = 5;
        double b [] = new double [m];
        int sum = 0;

         for ( int i = 0; i < m ; i++){
             for ( int j = 0; j < 0; j++){

                 if (matrix [i] [j] % 2 != 0 ){

                     sum += matrix [i] [j];


                     b [i] = sum;

                     System.out.println(Arrays.toString(b));


                 }
             }
        }
    }
}
