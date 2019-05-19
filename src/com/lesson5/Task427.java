package com.lesson5;

public class Task427 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int mul = 1;
        int k = 3;
        int n = m.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                if (m[i][j] % k == 0 && m[i][j] != 0)
                    mul *= m[i][j];
            }
        }
        System.out.println(mul);
    }
}
