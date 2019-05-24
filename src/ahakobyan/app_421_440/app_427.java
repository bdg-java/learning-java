package ahakobyan.app_421_440;

import ahakobyan.MatrixDefaultDecleration;

public class app_427 {
    public static void main(String[] args) {

        int [][] m = MatrixDefaultDecleration.GetDefaultMatrix();
        int a = 0;
        int k = 5;
        int b = m.length;
        int d = 1;

        for (int i = 0; i < m.length; i++) {
            for (int c = 0; b < b - i -2; b ++) {
                if (m[i][c] % k ==0) {
                    a ++;
                    d = d * m[i][c];
                }
            }
        }
        System.out.println(d);
    }
}
