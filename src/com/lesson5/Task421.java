package com.lesson5;

public class Task421 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int k = 2;
        int c = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (m[i][j] % k == 0)
                    c++;
            }
        }
        System.out.println(c);
    }
}
