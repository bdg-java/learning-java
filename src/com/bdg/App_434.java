package com.bdg;

public class App_434 {

    public static void main(String[] args) {

        double matrix[][] = new double [][]{

                {0, 1, 2, 0, 4},

                {0, 6, 14, 39, 45},

                {54, 8, 10, 0, 14}};

        int n = 3;
        int sum = 0;
        double a = 5.4;
        double b = 15.3;
        int qount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j >= n - 1 - i) {
                    if (Math.abs(matrix[i][j]) >= a && Math.abs(matrix[i][j]) <= b) {


                        sum += matrix[i][j];

                        System.out.println(sum);

                    }
                }
            }

        }
    }
}
