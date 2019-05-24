package ahakobyan.app_451_460;

import ahakobyan.MatrixDefaultDecleration;

import java.util.Arrays;

public class app_459 {
    public static void main(String[] args) {

        int [][] m = MatrixDefaultDecleration.GetDefaultMatrix();
        int c = m.length;
        double [] B = new double[c];
        int a = 1;

        for (int i =0; i < c; i ++) {
            for (int f =0; f < i; f++)
                if (m[i][f] < 0) {
                    a = a * m[i][f];
                    B[i] = a;
                }
        }
        System.out.println(Arrays.toString(B));
    }
}
