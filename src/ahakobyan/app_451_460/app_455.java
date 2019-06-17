package ahakobyan.app_451_460;

import ahakobyan.app_421_440.MatrixDefaultDecleration;

import java.util.Arrays;

public class app_455 {
    public static void main(String[] args) {

        int[][] m = MatrixDefaultDecleration.GetDefaultMatrix();
        int c = m.length;
        double[] B = new double[c];
        int a = 0;
        int b = 0;
        int sum = 0;
        int v = 0;

        for (int i =0; i < c; i++) {
            for (int f = 0; f < i; f++)
                a = m[i][f];
        }
        for (int i = 0; i < c; i++) {
            for (int f = c - i -1; f < c; f++)
                b = m[i][f];
        }
        sum = a * b;
        B[v] = sum;
        System.out.println(Arrays.toString(B));
    }
}
