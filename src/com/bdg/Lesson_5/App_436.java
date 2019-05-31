package com.bdg.Lesson_5;

public class App_436 {
    public static void main(String[] args) {

        int[][] matrix = {{6, 5, 15, 22},
                {-9, 9, 6, 7},
                {17, 5, 6, 19},
                {16, 3, 5, -8}
        };
        double a =10;
        double b =20;
        int sum =0;
        int x =0;

        for (int i=0; i<matrix.length;i++){
            for (int j=0; j < matrix.length -i -1; j++){
                if (Math.abs(matrix[i][j]) >= a && Math.abs(matrix[i][j]) <= b){
                    sum += matrix[i][j];
                    x++;
                }
            }
        }
        System.out.println(sum/x);
    }
}