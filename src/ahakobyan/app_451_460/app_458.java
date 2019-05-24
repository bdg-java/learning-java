package ahakobyan.app_451_460;

import ahakobyan.MatrixDefaultDecleration;

import java.util.Arrays;

public class app_458 {
    public static void main(String[] args) {

        int[][] m = MatrixDefaultDecleration.GetDefaultMatrix();
        int c = m.length;
        double[] B = new double[c];
        int k = 4;
        int a = 0;

        for (int i = 0; i < c; i++) {
            for (int f = 0; f < i; f++)
                if (Math.abs(m[i][f]) > k) {
                    a++;
                    B[i] = a;
                }
        }
        System.out.println(Arrays.toString(B));
    }
}
