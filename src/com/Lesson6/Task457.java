package com.Lesson6;

import com.lesson5.MatrixDefaultDeclaration;

import java.util.Arrays;

public class Task457 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int n = m.length;
        double[] b = new double[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] % 2 != 0)
                    b[i] += m[i][j];
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
