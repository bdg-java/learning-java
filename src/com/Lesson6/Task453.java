package com.Lesson6;

import com.lesson5.MatrixDefaultDeclaration;

import java.util.Arrays;

public class Task453 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int n = m.length;
        int a0 = 2;
        int b0 = 7;
        double[] b = new double[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                if (m[i][j] >= a0 && m[i][j] <= b0) {
                    b[i] += m[i][j];
                }
        }
        System.out.println(Arrays.toString(b));
    }
}
