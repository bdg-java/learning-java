package com.lesson5;

public class TaskIsoscelesTriangle {
    public static void main(String[] args) {
        int n = 10;
        char[][] m = CharStarMatrixArrayDeclaration.getDefaultMatrix();
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= (n / 2) - i && j <= ((n / 2) + i))
                    System.out.print(m[i][j]);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
