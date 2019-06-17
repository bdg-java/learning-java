package ahakobyan.app_421_440;

public class app_432 {
    public static void main(String[] args) {

        int[][] n = MatrixDefaultDecleration.GetDefaultMatrix();
        int a = 0;
        int b = n.length;
        double d = 1;

        for (int i = 0; i< n.length; i++) {
            for (int c = b - i- 1; c < b; c++) {
                if ((i + c) % 2 != 0) {
                    a++;
                 d = d+ n[i][c] * n[i][c];
                }
            }
        }
        System.out.println(Math.sqrt(d/a));
    }
}
