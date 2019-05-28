package com.bdg;

public class App_439 {

    public static void main(String[] args) {

        int matrix [] [] = new int [] [] {


                {0, 1, 2, 3, 4},

                {5, 6, 14, 39, 45},

                {54, 8, 10, 34, 14}};

            int n = 3;
            int mul = 0;
            int sum = 0;


            for ( int i = 0; i < n; i++){
                for (int j = 0; j < n ; j++){

                    if ( j < i){
                        if ((i +j ) % 2 != 0 ){



                            mul += matrix [i][j];

                            System.out.println(mul);


                        }
                    }
                }
        }


    }
}
