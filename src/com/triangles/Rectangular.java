package com.triangles;

public class Rectangular {

    public static void main(String[] args) {
		
		int n = 11;
        
        String[][] equalSightsTriangle = new String[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n - 1) {
                    equalSightsTriangle[i][j] = "* ";
                } else if ((j == 0 || j == n - 1) && i != 0) {
                    equalSightsTriangle[i][j] = "* ";
                } else {
                    equalSightsTriangle[i][j] = "  ";
                }
                    
            }
        }
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(equalSightsTriangle[i][j]);
			}
			System.out.println();
		}
    }
}