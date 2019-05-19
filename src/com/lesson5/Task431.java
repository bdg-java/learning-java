package com.lesson5;

public class Task431 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDeclaration.GetDefaultMatrix();
        int c = 0;
        int n = m.length;
        for (int i = 0; i < n; i++) {
            for (int j = n - i - 1; j < n; j++) {
                if ((i + j) % 2 != 0)
                    c++;
            }
        }
        System.out.println(c);
    }
}
