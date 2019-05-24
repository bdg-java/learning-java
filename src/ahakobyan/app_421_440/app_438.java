package ahakobyan.app_421_440;

import ahakobyan.MatrixDefaultDecleration;

public class app_438 {
    public static void main(String[] args) {

        int[][] n = MatrixDefaultDecleration.GetDefaultMatrix();
        int a= 0;

        for (int i = 0; i < n.length; i++) {
            for (int f = 0; f < i; f+= 2) {
                if (n[i][f] >0) {
                    a++;
                }
            }
        }
        System.out.println(a);
    }
}
