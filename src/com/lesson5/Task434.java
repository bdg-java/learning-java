package com.lesson5;

public class Task434 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int sum = 0;
        int n = m.length;
        double a = 5.4, b = 15.3;
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j < n; j++) {
                if (Math.abs(m[i][j]) >= a && Math.abs(m[i][j]) <= b)
                    sum += m[i][j];
            }
        }
        System.out.println(sum);
    }
}
