package com.bdg;

import java.util.Arrays;

public class App_455 {

    public static void main(String[] args) {

        int matrix [] [] = new int  [] []{

                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1}};

          int m = 5;
          int x = 1;
          double [] b = new double [m];

          for ( int i = 0; i < m ; m++){

                  b [i] = matrix [i] [i] *   matrix [i] [m - 1 - i];

                  System.out.println(Arrays.toString(b));
              }
          }

    }


