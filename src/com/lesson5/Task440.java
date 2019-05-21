package com.lesson5;

public class Task440 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int sum = 0;
        int n = m.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((i + j) % 2 == 0)
                    sum += m[i][j];
            }
        }
        System.out.println(sum);
    }
}
