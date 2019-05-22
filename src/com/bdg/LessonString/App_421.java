package com.bdg.LessonString;

public class App_421 {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 4, 7},
                {2, 5, 8},
                {3, 6, 10},
        };
        int numOfArrayCols = 3;
        int sum = 0;
        int k = 5;

        for (int i = 0; i < numOfArrayCols; i++) {
            if (matrix[i][i] % 2 == 0)
                sum += matrix[i][i];
            for (int j = 0; j < numOfArrayCols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][j] = 1;
                }
            }
            System.out.println(sum);
        }




    }
}

