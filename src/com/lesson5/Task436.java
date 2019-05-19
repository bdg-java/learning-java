package com.lesson5;

public class Task436 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int c = 0;
        int sum = 0;
        int a = 2, b = 8;
        int n = m.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (m[i][j] >= a && m[i][j] <= b) {
                    sum += m[i][j];
                    c++;
                }
            }
        }
        System.out.println(sum / c);
    }
}
