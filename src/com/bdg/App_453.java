package com.bdg;

import java.util.Arrays;

public class App_453 {

    public static void main(String[] args) {

        int matrix [] [] = new int [] [] {

                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1}};

         int sum =0;
         int m = 5;
        double [] B = new double [m];
        int a = -2;
        int b = 4;

         for ( int i = 0; i < m ; i++){
             for ( int k = 0; k < m ; k++){

                 if ( matrix [i] [k] >= a && matrix [i][k] <= b){

                     B[i] += matrix [i][k];

                     System.out.println(Arrays.toString(B));


                 }


             }

         }

    }
    }

