package com.lesson5;

public class Task429 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int c = 0;
        int n = m.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (m[i][j] % 5 == 2) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
