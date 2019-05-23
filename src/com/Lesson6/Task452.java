package com.Lesson6;

import com.lesson5.MatrixDefaultDeclaration;

import java.util.Arrays;

public class Task452 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int n = m.length;
        double[] b = new double[n];
        for (int i = 0; i < n; i++) {
            b[i] = m[i][0] * m[i][0] + m[i][n - 1] * m[i][n - 1];
        }
        System.out.println(Arrays.toString(b));
    }
}
