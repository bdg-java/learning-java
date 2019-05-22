package com.bdg.LessonString;

public class App_428 {

    public static void main(String[] args) {

        int[][] matrix = {
                {2, 3, 25},
                {0, 0, 6},
                {10, 26, 1},
        };
        int cout = 0;

        for (int i =0; i < matrix.length; i++){
            for (int j =0; j <= matrix.length - i -2;j++){
                //System.out.println(matrix[i][j]);
                if (matrix[i][j]  == 0){
                    // System.out.println(matrix[i][j]);
                    cout ++;
                }
            }
        }
        System.out.println(cout);


    }
}
