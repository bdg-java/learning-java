package com.lesson5;

public class Task430 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int c = 0;
        int n = m.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (m[i][j] % 2 == 0) {
                    c++;
                    sum += m[i][j];
                }
            }
        }
        System.out.println(sum / c);
    }
}
