package com.lesson5;

public class Task438 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int c = 0;
        int n = m.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= i; j += 2) {
                if (m[i][j] > 0) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
