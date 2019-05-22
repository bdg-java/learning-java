package com.bdg.LessonString;

public class App_431 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 25},
                {50, 4, 6},
                {10, 26, 1},
        };
        int sum = 0;
        int cout = 0
                ;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <= i; j++) {
                //System.out.println(matrix[i][j]);
                if(i+j == 1){
                    cout ++;
                    //System.out.println(matrix[i][j]);
                }
            }
        }
        System.out.println(cout);

    }
}
