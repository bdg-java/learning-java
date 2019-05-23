package com.Lesson6;

import com.lesson5.MatrixDefaultDeclaration;

import java.util.Arrays;

public class Task459 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int n = m.length;
        double[] b = new double[n];
        double mul = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (m[i][j] < 0)
                    mul *= m[i][j];
            }
            b[i] = mul;
            mul = 1;
        }
        System.out.println(Arrays.toString(b));
    }
}
