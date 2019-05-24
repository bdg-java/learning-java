package ahakobyan.app_421_440;

import ahakobyan.MatrixDefaultDecleration;

public class app_429 {
    public static void main(String[] args) {

        int[][] m = MatrixDefaultDecleration.GetDefaultMatrix();
        int a = 0;

        for (int i = 0; i < m.length; i++) {
            for (int c = 0; c < i; c++) {
                if (m[i][c] % 5 == 2) {
                    a++;
                }
            }
        }
        System.out.println(a);
    }
}
