package com.lesson5;

public class MatrixDefaultDeclaration {
    private static final int[][] def_matrix = {{5, -2, 2, 0},
            {9, 6, -89, 2},
            {0, -5, 6, 4},
            {1, 2, 8, 16}
    };

    //according java method convention method names should be male case :)
    public static int[][] GetDefaultMatrix() {
        return def_matrix;
    }
}
