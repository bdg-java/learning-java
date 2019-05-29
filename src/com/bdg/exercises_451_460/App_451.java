package com.bdg.exercises_451_460;

import com.bdg.exercises_421_440.TwoDimensionalArrays;

public class App_451 {
    public static void main(String[] args) {
        int m = 5;
        double sum = 0;
       // int[][] matrix = new int[m][m];
       int[][] matrix = TwoDimensionalArrays.getDefaultArray();
       for (int i=0;i<matrix.length;i++){
           for (int j=0;j<matrix.length;j++){
               if(i==j){
                   System.out.println(matrix[i][j]);
                   sum+=matrix[i][j];
               }
               if(j==matrix.length-1-i){
                   System.out.println(matrix[i][j]);
               }



           }
       }
    }
}
