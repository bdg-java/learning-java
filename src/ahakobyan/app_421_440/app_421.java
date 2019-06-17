package ahakobyan.app_421_440;

public class app_421 {
    public static void main(String[] args) {

        int[][] m = MatrixDefaultDecleration.GetDefaultMatrix();
        int k = 4;
        int a = 0;

        for (int i = 0; i < m.length; i++) {
            for (int b = 0; b < i ; b++) {
                if (m[i][b] % k == 0 ) {
                    a++;
                }
                System.out.println(a);
            }
        }






    }
}
