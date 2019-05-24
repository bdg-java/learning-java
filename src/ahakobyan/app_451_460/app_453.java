package ahakobyan.app_451_460;

import ahakobyan.MatrixDefaultDecleration;

import java.util.Arrays;

public class app_453 {
    public static void main(String[] args) {

        int[][] m = MatrixDefaultDecleration.GetDefaultMatrix();
        int c = m.length;
        double [] B = new double[c];
        int a = 3;
        int b = 8;
        int sum = 0;

        for (int i = 0; i<m.length; i++) {
            for (int f = 0; f< i; f++) {
                if (m[i][f] > a && m[i][f] < b) {
                    B[i] = B[i] + m[i][f];
                }
            }
        }
        System.out.println(Arrays.toString(B));
    }
}
