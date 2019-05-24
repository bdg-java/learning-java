package ahakobyan.app_421_440;

import ahakobyan.MatrixDefaultDecleration;

public class app_436 {
    public static void main(String[] args) {

        int[][] n = MatrixDefaultDecleration.GetDefaultMatrix();
        int a = 5;
        int b = 7;
        int c = 0;
        int d = 0;

        for (int i = 0; i <n.length; i++) {
            for (int f = 0; f < i; f++) {
                if (n[i][f] >= a && n[i][f] <= b) {
                    c++;
                    d = d + n[i][f];
                }
            }
        }
        System.out.println(d/c);
    }
}
