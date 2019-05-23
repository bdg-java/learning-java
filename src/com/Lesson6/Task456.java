package com.Lesson6;

import com.lesson5.MatrixDefaultDeclaration;

import java.util.Arrays;

public class Task456 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int n = m.length;
        double[] b = new double[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] > 0)
                    b[i]++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
