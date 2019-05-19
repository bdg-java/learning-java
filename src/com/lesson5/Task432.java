package com.lesson5;

public class Task432 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int c = 0;
        double sum = 0;
        int n = m.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n - i - 1; j++) {
                if ((i + j) % 2 != 0) {
                    c++;
                    sum += m[i][j] * m[i][j];
                }
            }
        }
        if (c > 0)
            sum = Math.sqrt(sum / c);
        System.out.println(sum);

    }
}
