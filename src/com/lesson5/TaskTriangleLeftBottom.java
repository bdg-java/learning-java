package com.lesson5;

public class TaskTriangleLeftBottom {
    public static void main(String[] args) {
        int n = 10;
        char[][] m = CharStarMatrixArrayDeclaration.getDefaultMatrix();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(m[i][j]);
            }
            System.out.println();
        }
    }

}