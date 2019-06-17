package ahakobyan.app_421_440;

public class app_423 {
    public static void main(String[] args) {

        int[][] m = MatrixDefaultDecleration.GetDefaultMatrix();
        int a  = 0;
        int b = 1;

        for (int i = 0; i < m.length; i++) {
            for (int c = 0; c < i; c++) {
                if (m[i][c] % 2 == 0) {
                    a++;
                    b *= m[i][c];
                }
            }
        }
        System.out.println(b/a);
    }
}
