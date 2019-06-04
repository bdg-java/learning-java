package com.triangles;

public class Right3 {

    public static void main(String[] args) {
		
		int n = 10;
        
        char[][] rightTriangle = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (n - j - 1 <= i) {
                    rightTriangle[i][j] = '*';
                } else {
                    rightTriangle[i][j] = ' ';
                }
                    
            }
        }
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(rightTriangle[i][j]);
			}
			System.out.println();
		}
    }
}