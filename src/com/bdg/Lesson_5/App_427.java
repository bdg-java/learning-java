package com.bdg.Lesson_5;

public class App_427 {
    public static void main(String[] args) {

        int[][] matrix = {{ 5, 4, 31, 18},
                { 12, -5 , -6 , 11},
                { 23, 4, 56 ,14},
                { 10, 32, -9, 7}
        };
        int sum =1;
        int k = 3;
        int z = matrix.length;

        for (int i =0; i < z; i++){
            for (int j =0; j <= z - i -2;j++){
                if (matrix[i][j] % k == 0 ){
                    sum *= matrix[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}

