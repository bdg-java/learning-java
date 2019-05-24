package ahakobyan.app_421_440;

import ahakobyan.MatrixDefaultDecleration;

public class app_435 {
    public static void main(String[] args) {

        int [][] n = MatrixDefaultDecleration.GetDefaultMatrix();
        int a = 0;
        int b = n.length;

        for (int i = 0; i < n.length; i++) {
            for (int f = b - i - 1; f < b; f++) {
                if (n[i][f] % 5 == 0) {
                    a++;
                }
            }
        }
        System.out.println(a);
    }
}
