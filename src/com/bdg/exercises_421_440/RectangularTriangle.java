package com.bdg.exercises_421_440;

public class RectangularTriangle {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        char[][] twoDimensionalArray = new char[n][m];
        char k = '*';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i <= j) {
                    twoDimensionalArray[i][j] = k;
                } else {
                    twoDimensionalArray[i][j] = ' ';
                }

                System.out.print(twoDimensionalArray[i][j]);
            }
            System.out.println();
        }

    }
}
