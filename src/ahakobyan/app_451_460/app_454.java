package ahakobyan.app_451_460;

import ahakobyan.app_421_440.MatrixDefaultDecleration;

import java.util.Arrays;

public class app_454 {
    public static void main(String[] args) {

        int[][] m = MatrixDefaultDecleration.GetDefaultMatrix();
        int c = m.length;
        double[] B = new double[c];
        int a = 1;

        for (int i = 0; i < m.length; i++) {
            for (int f = 0; f < i; f++) {
                a = a * m[i][f] *m[i][f];
                B[i] = a;
            }
        }
        System.out.println(Arrays.toString(B));
    }
}