package ahakobyan.app_421_440;

import ahakobyan.MatrixDefaultDecleration;

public class app_439 {
        public static void main(String[] args) {

            int[][] n = MatrixDefaultDecleration.GetDefaultMatrix();
            int a = 0;

            for (int i = 0; i < n.length; i++) {
                for (int f = 0; f < i; f++) {
                    if (n[i][f] > 0 && (i +f) % 2 == 0) {
                        a++;
                    }
                }
            }
            System.out.println(a);
        }
}
