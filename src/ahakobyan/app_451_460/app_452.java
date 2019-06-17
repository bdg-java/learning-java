package ahakobyan.app_451_460;

import ahakobyan.app_421_440.MatrixDefaultDecleration;

import java.util.Arrays;

public class app_452 {
    public static void main(String[] args) {

        int [][] m = MatrixDefaultDecleration.GetDefaultMatrix();
        int c = m.length;
        double [] B = new double[c];

        for (int i =0; i <m.length; i++) {
            B[i] = (m[i][0] * m[i][0]) + (m[i][c - 1] * m[i][c-1]);
        }
        System.out.println(Arrays.toString(B));
    }
}
