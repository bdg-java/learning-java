package lesson6;

import com.sun.prism.shader.Solid_ImagePattern_Loader;

public class App_454 {
    public static void main(String[] args) {
        int[][] matrix = {
                {2, 3, 6, 9},
                {5, 4, 6, 6},
                {8, 3, 1, 7},
        };
        int x = matrix.length;
        double mult = 1;

        for (int i = 0; i < x; i++) {
            for (int k = 0; k < x; k++) {
                mult *= Math.pow(matrix[i][k], 2);
            }
            System.out.println(mult);
        }
    }
}
