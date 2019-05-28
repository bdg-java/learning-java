package com.bdg;

public class App_433 {

    public static void main(String[] args) {

        int matrix [] [] = new int [] [] {

                {0, 1, 2, 0, 4},

                {0, 32, 0, 39, 45},

                {54, 0, 20, 0, 14}};

         int a = -2;
         int b = 3;
         int n = 3;
         int qount = 0;


         for ( int i = 0; i < n ; i++){
             for ( int j = 0; j < n ; j++){

                 if ( j < n - 1 - i){

                     if ( matrix  [i] [j] >= a && matrix [i] [j] <= b){

                         qount ++;


                         System.out.println(qount);


                     }
                 }
             }


        }
    }
}
