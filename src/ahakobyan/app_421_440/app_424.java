package ahakobyan.app_421_440;

import ahakobyan.MatrixDefaultDecleration;

public class app_424 {
    public static void main(String[] args) {

        int [][] m = MatrixDefaultDecleration.GetDefaultMatrix();
        int a = 0;
        int b = 0;

        for (int i = 0; i < m.length; i++) {
            for (int c = 0; c< i; c++) {
                if (m[i][c] % 2 !=0 ) {
                    a++;
                    b = b + m[i][c];
                }
            }
        }
        System.out.println(b/a);
    }
}
