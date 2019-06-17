package ahakobyan.app_421_440;

public class app_422 {
    public static void main(String[] args) {
        int[][] m = MatrixDefaultDecleration.GetDefaultMatrix();
        int k = 5;
        int a = 0;
        int c = 0;

        for (int i = 0; i < m.length; i ++) {
            for (int b = 0; b < i; b++) {
                if (m[i][b] % 5 == 0) {
                    a++;
                    c = c + m[i][b];
                }
            }
        }
        System.out.println(c/a);
    }
}
