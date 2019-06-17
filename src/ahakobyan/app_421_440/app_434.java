package ahakobyan.app_421_440;

public class app_434 {
    public static void main(String[] args) {

        int [][] n = MatrixDefaultDecleration.GetDefaultMatrix();
        double a = 5.4;
        double b = 15.3;
        int c = 0;
        int d = n.length;

        for (int i = 0; i < n.length; i++) {
            for (int f = d - i- 1; f < d; f++) {
                if (Math.abs(n[i][f]) >= a && Math.abs(n[i][f]) <= b ) {
                    c = c + n[i][f];
                }
            }
        }
        System.out.println(c);
    }
}
