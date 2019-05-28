package com.bdg;

public class App_435 {

    public static void main(String[] args) {

        int matrix[] [] = new int [] [] {

                {0, 1, 2, 0, 4},

                {0, 6, 14, 39, 45},

                {54, 8, 10, 0, 14}};

           int a = -1 ;
           int b = 4;
           int n = 3;
           int sum = 0;
           int qount =0;

           for (int i = 0; i < n; i ++){
               for ( int j = 0 ; j < n; j++){

                   if ( j > i){
                       if ( matrix [i] [j] >= a && matrix [i] [j] <= b){

                           qount ++;

                           sum += matrix [i][j];

                           System.out.println((double ) sum/qount );

                       }
                   }
               }
        }
    }
}
