package com.bdg.agharibyan;

public class Havasarasrun_erankyunner {
    public static void main(String[] args) {

        int m = 10;
        int n = 10;
        char [][] matrix = new char [m][n];

        for (int i = 0; i < m/2; i++){
            for (int j = 0; j < n; j++){
                if ( j > i && j < m - i){
                    matrix[i][j] = '*';
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < m/2; i++){
            for (int j = 0; j < n; j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = m/2; i < m; i++){
            for (int j = 0; j < n; j++){
                if ( j <= i && j >= m - i){
                    matrix [i][j] = '*';
                } else {
                    matrix [i][j] = ' ';
                }
            }
        }
        for (int i = m/2; i < m; i++){
            for (int j = 0; j < n; j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n/2; j++){
                if ( j < i && j < m - i){
                    matrix[i][j] = '*';
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n/2; j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < m; i++){
            for (int j = n/2; j < n; j++){
                if ( j > i && j > m - i){
                    matrix[i][j] = '*';
                } else {
                    matrix[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = n/2; j < n; j++){
                System.out.print(" "+matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();

    }
}
