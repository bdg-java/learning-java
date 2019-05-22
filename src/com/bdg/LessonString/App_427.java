package com.bdg.LessonString;

public class App_427 {
    public static void main(String[] args) {

        int[][] matrix = {
                {2, 3, 25},
                {50, 4, 6},
                {10, 26, 1},
        };
        int sum = 1;
        int k = 5;
        for (int i =0; i < matrix.length; i++){
            for (int j =0; j <= matrix.length - i -2;j++){
                //System.out.println(matrix[i][j]);
                if (matrix[i][j] % k == 0){
                    // System.out.println(matrix[i][j]);
                    sum *= matrix[i][j];
                }
            }
        }
        System.out.println(sum);


    }
}
