package com.bdg.exercises_421_440;

public class App_440 {
    public static void main(String[] args) {
        double[][] matrix = TwoDimensionalArrays.getDefaultDoubleArray();
        double sum = 0;
        for (int i =0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                if(i<j && (i+j)%2 == 0){
                    sum+= matrix[i][j];
                }

            }
        }
        System.out.println(sum);

    }
}
