package ahakobyan.app_451_460;

import ahakobyan.MatrixDefaultDecleration;

import java.util.Arrays;

public class app_451 {
    public static void main(String[] args) {

        int [][] m = MatrixDefaultDecleration.GetDefaultMatrix();
        int a = 0;
        int b = m.length;
        int c = 0;
        int sum1 = 0;
        double [] B = new double[b];
        int v = 0;


        for (int i = 0; i < m.length; i ++) {
            for (int f = 0; f < i; f++) {
                a++;
                c = c + m[i][f];
                sum1 = c/a;
            }
        }
        int s = 0;
        int g = 0;
        int sum2 = 0;

        for (int i = 0; i < m.length; i++) {
            for (int f = b - i - 1; f < b; f++ ) {
                s++;
                g = g + m[i][f];
                sum2 = g/a;
            }
        }
        B[v] = (sum1 + sum2) / 2;
        System.out.println(Arrays.toString(B));
    }
}
