package com.bdg.exercises_421_440;

public class App_437 {
    public static void main(String[] args) {
        double[][] matrix = TwoDimensionalArrays.getDefaultDoubleArray();
        int count = 0;
        double sum = 0;

        for (int i =0;i<matrix.length;i++){
            for (int j=0;j<matrix.length;j++){
                if(i>=j && (int)matrix[i][j] == matrix[i][j]){
                    sum+= Math.pow(matrix[i][j],2);
                    count++;
                }

            }
        }
        if(count !=0){
            System.out.println(Math.sqrt(sum/count));
        }

    }
}
