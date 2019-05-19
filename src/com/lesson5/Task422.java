package com.lesson5;

public class Task422 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int c = 0;
        int sum = 0;
        for (int i = 1; i < m.length; i++) {
            for (int j = 0; j < i; j++) {
                if (m[i][j] % 5 == 0) {
                    c++;
                    sum += m[i][i];
                }
            }
        }
        System.out.println(sum / c);
    }

}
