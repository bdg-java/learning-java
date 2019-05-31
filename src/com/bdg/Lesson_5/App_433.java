package com.bdg.Lesson_5;

public class App_433 {
    public static void main(String[] args) {
        int[][] matrix = {{6, 5, 15, 22},
                {-9, 9, 6, 7},
                {17, 5, 6, 19},
                {16, 3, 5, -8}
        };
        int a =10;
        int b =20;
        int x =0;

        for (int i=0; i<matrix.length;i++){
            for (int j=0; j <= matrix.length -i -1; j++){
                if (matrix[i][j] >= a && matrix[i][j]<= b){
                    x++;
                }
            }
        }
        System.out.println(x);
    }
}
