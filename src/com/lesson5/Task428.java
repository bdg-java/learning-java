package com.lesson5;

public class Task428 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int c = 0;
        int k = 3;
        int n = m.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                if (m[i][j] == 0)
                    c++;
            }
        }
        System.out.println(c);
    }
}
