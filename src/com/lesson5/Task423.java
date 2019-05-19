package com.lesson5;

public class Task423 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int c = 0;
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (m[i][j] % 2 == 0) {
                    c++;
                    sum += m[i][j] * m[i][j];
                }
            }
        }
        sum = Math.sqrt(sum / c);
        System.out.println(sum);
    }
}
