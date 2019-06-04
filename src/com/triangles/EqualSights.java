package com.triangles;

public class EqualSights {

    public static void main(String[] args) {
		
		int n = 11;
        
        char[][] equalSightsTriangle = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 5) {
                    equalSightsTriangle[i][j] = ' ';
                } else if (j >= n / 2 - i && j <= n / 2 + i) {
                    equalSightsTriangle[i][j] = '*';
                } else {
                    equalSightsTriangle[i][j] = ' ';
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