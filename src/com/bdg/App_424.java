package com.bdg;

public class App_424 {
    public static void main(String[] args) {

        int [] [] matrix = new int [] []{

                {0, 1, 2, 3, 4},

                {54, 32, 96, 39, 45},

                {54, 15, 20, 59, 14}};

           int m = 3;
           int sum = 0;
           int  qount = 0;

           for ( int i = 0; i < m; i++){
               for ( int j = 0; j < m ; j++){

                   if ( j <= i ){

                       if ( matrix [i] [j] % 2 != 0){
                           qount  ++;

                           sum += matrix [i][j];

                           System.out.println((double) sum/qount);





                       }
                   }
               }


        }

    }
}