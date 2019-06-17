package ahakobyan.app_421_440;

public class app_426 {
    public static void main(String[] args) {

        int [][] m = MatrixDefaultDecleration.GetDefaultMatrix();
        int a = 0;
        int b = m.length;

        for (int i = 0; i < m.length; i ++) {
            for (int c  = 0; c < b - i - 2; c++ ) {
                if (m[i][c] % 2 == 0) {
                    a = a + m[i] [c];
                }
            }
        }
        System.out.println(a);
    }
}
