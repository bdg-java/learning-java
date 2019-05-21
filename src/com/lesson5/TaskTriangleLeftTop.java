package com.lesson5;

public class TaskTriangleLeftTop {
    public static void main(String[] args) {
        int n = 10;
        char[][] m = CharStarMatrixArrayDeclaration.getDefaultMatrix();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }
}
