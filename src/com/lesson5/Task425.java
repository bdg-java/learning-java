package com.lesson5;

public class Task425 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int c = 0;
        for (int i = 1; i < m.length; i++) {
            for (int j = 0; j < i; j++) {
                if (m[i][j] % 2 == 0) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
