package com.bdg.Lesson_5;

public class App_428 {
    public static void main(String[] args) {
        int[][] matrix = {{ 5, 4, 0, 18},
                { 12, 0 , -6 , 11},
                { 23, 4, 56 ,14},
                { 10, 32, -9, 7}
        };
        int x = 0;
        int z = matrix.length;

        for (int i =0; i < z; i++){
            for (int j =0; j <= z - i -2;j++){
                if (matrix[i][j]  == 0){
                    x++;
                }
            }
        }
        System.out.println(x);
    }
}

