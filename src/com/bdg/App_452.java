package com.bdg;

import java.util.Arrays;


public class App_452{

    public static void main(String[] args) {

     int matrix [] [] = new int [] []{

             {1, 2, 3, 4, 5},
             {1, 2, 3, 4, 5},
             {1, 2, 3, 4, 5},
             {1, 2, 3, 4, 5},
             {5, 4, 3, 2, 1}};

       int m = 5;
       int sum = 0;
        double [] b = new double [m];

        for ( int i = 0; i < m ; i ++){

            b[i] = Math.pow (matrix [i] [0], 2) + Math.pow(matrix [i] [m -1], 2);

            System.out.println(Arrays.toString (b));





        }

     }
    }

