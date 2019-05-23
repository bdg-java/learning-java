package com.lesson5;

public class TaskIsoscelesTriangle {
    public static void main(String[] args) {
        char[][] m = CharStarMatrixArrayDeclaration.getDefaultMatrix();
        int n = m.length;
        int h = n / 2;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= h - i && j <= h + i)
                    System.out.print(m[i][j]);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
