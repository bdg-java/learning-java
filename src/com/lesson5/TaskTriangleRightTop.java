package com.lesson5;

public class TaskTriangleRightTop {
    public static void main(String[] args) {
        int n = 10;
        char[][] m = CharStarMatrixArrayDeclaration.getDefaultMatrix();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i)
                    System.out.print(m[i][j]);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
