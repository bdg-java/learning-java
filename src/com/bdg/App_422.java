package com.bdg;

public class App_422 {

    public static void main(String[] args) {


        int[][] matrix = new int[][] {
                {0, 1, 2, 3, 4},

                {54, 32, 96, 39, 45},

                {54, 15, 20, 59, 14}};


                int sum = 0;
                int mul = 0;
                int m = 5;

                for ( int i = 0; i < m ; i++){
                    for (int j = 0; j < m; j++){

                        if ( j < i ){
                            if ( matrix [i] [j] % 5 == 0){

                                mul ++;

                                sum += matrix [i][j];

                                System.out.println((sum/mul));


                            }


                        }
                }
        }

    }

}
