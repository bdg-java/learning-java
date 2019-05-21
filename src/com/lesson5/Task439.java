package com.lesson5;

public class Task439 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int mul = 1;
        int n = m.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((i + j) % 2 != 0 && m[i][j] != 0)
                    mul *= m[i][j];
            }
        }
        System.out.println(mul);
    }
}
