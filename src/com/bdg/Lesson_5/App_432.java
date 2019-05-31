package com.bdg.Lesson_5;

public class App_432 {
    public static void main(String[] args) {
        int[][] matrix = {{6, 5, 15, 22},
                {-9, 9, 6, 7},
                {17, 5, 6, 19},
                {16, 3, 5, -8}
        };
        int x =0;
        double sum =0;

        for(int i =0; i <matrix.length;i++){
            for (int j = 0; j <= matrix.length -i -1; j++){
                if ((i+j) % 2 !=0){
                    x++;
                    sum += matrix[i][j] * matrix[i][j];
                }
            }
        }
        if (x > 0)
            sum = Math.sqrt(sum / x);
        System.out.println(sum);
    }
}
