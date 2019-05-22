package com.bdg.Lesson_5;

public class App_434 {
    public static void main(String[] args) {

    int[][] matrix = {{6, 5, 15, 22},
            {-9, 9, 6, 7},
            {17, 5, 6, 19},
            {16, 3, 5, -8}
    };
    double a =5.4;
    double b =15.3;
    int sum =0;

        for (int i=0; i<matrix.length;i++){
        for (int j=0; j <= matrix.length -i -1; j++){
            if (Math.abs(matrix[i][j]) >= a && Math.abs(matrix[i][j]) <= b){
                sum += matrix[i][j];
            }
        }
    }
        System.out.println(sum);
}
}