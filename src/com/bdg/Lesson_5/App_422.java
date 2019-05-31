package com.bdg.Lesson_5;

public class App_422 {
    public static void main(String[] args) {
        int[][] matrix = {{ 15, 4, 31, 18},
                { 12, -5 , -6 , 11},
                { 23, 4, 56 ,14},
                { 10, 32, -9, 7}
        };
        int k=5;
        int sum =0;
        int c=0;

        for (int i=0; i <matrix.length;i++){
            for (int j=0; j < i; j++){
                if(matrix[i][j] % 5 ==0){
                    sum += matrix[i][j];
                    c++;
                }
            }
        }
        System.out.println(sum/c);
    }
}
