package com.bdg;

import java.util.Arrays;

public class App_454 {

    public static void main(String[] args) {

        int matrix[][] = new int[][]{

                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1}};


         int x = 1;
        int m = 5;
        double[] b = new double[m];

        for (int i = 0; i < m; m++) {
            for (int k = 0; k < m; k++) {


               x = x * (int)Math.pow (matrix [i][k],2);

               b [i] = x;

               System.out.print(Arrays.toString(b));
            }
        }
    }

}