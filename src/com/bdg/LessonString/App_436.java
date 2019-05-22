package com.bdg.LessonString;

public class App_436 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 25},
                {50, 4, 6},
                {10, 26, 1},
        };
        int sum = 0;
        int cout = 1;
        int a =5;
        int b = 10;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
        //        System.out.println(matrix[i][j]);
                if(matrix[i][j]<=a && matrix[i][j]<=b){
                    cout ++;
                    sum += matrix[i][j];
                    //System.out.println(matrix[i][j]);
                }
            }
        }
        System.out.println(sum/cout);

    }
}
