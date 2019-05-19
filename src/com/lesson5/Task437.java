package com.lesson5;

public class Task437 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int c = 0;
        double sum = 0;
        int n = m.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if ((int) m[i][j] == m[i][j]) {
                    sum += m[i][j] * m[i][j];
                    c++;
                }
            }
        }
        if (c > 0)
            sum = Math.sqrt(sum / c);
        System.out.println(sum);
    }
}
