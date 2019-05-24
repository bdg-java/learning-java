package ahakobyan.app_421_440;

import ahakobyan.MatrixDefaultDecleration;

public class app_437 {
    public static void main(String[] args) {

        int[][] n = MatrixDefaultDecleration.GetDefaultMatrix();
        int a = 0;
        double b = 1;

        for (int i = 0; i < n.length; i++) {
            for (int f = 0; f < i; f++) {
                if (n[i][f] % 10 == 0) {
                    a++;
                    b = b + n[i][f] *n[i][f];
                }
            }
        }
        System.out.println(Math.sqrt(b/a));
    }
}
