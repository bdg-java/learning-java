package com.lesson5;

public class CharStarMatrixArrayDeclaration {
    private static final char[][] def_matrix = {{'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*', '*', '*', '*', '*', '*', '*'}};


    //according java method convention method names should be male case :)
    public static char[][] getDefaultMatrix() {
        return def_matrix;
    }
}
