package com.bdg;

public class App_438 {

    public static void main(String[] args) {

        int matrix [] [] = new int [] []{

                {0, 1, 2, 0, 4},

                {0, 6, 14, 39, 45},

                {54, 8, 10, 0, 14}};

        int n = 3;
        int qount = 0;

        for ( int i = 0; i < n; n++){
            for ( int j = 0; j < n ; j++) {

                if ( j > i) {

                    if ( matrix [i] [j]  > 0 && j % 2 == 0){

                      qount ++;

                      System.out.println(qount);

                    }
                }
            }


        }
    }
}
