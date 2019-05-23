package com.Lesson6;

import com.lesson5.MatrixDefaultDeclaration;

import java.util.Arrays;

public class Task455 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int n = m.length;
        double[] b = new double[n];
        for (int i = 0; i < n; i++) {
            if (i != n - i - 1) {
                b[i] = (m[i][i] * m[i][n - 1 - i]);
            } else {
                b[i] = m[i][i];
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
