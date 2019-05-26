package com.bdg;

public class App_421 {

    public static void main(String[] args) {


        int[][] matrix = new int[][]{
                {0, 1, 2, 3},
                {54, 32, 96, 39}}; //<-- stex , (storaket er) u phakox } phakagicner pakasum


        int m = 4;

        int k = 3;
        int qount = 0;

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < m; j++) {

                if (j < i) {
                    if (matrix[i][j] % k == 0) {
                        qount++;

                        System.out.print(qount);

                    }
                }
            }

        }

    } //<-- stex el mi hat shat er drac }
}