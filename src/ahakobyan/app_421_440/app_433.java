package ahakobyan.app_421_440;

public class app_433 {
    public static void main(String[] args) {

        int [][] n = MatrixDefaultDecleration.GetDefaultMatrix();
        int a = 0;
        int b = 14;
        int d = 0;
        int c = n.length;

        for (int i = 0; i< n.length; i++) {
            for (int f = c - i -1; f < c; f++){
                if (n[i][f] > a && n[i][f] < b) {
                    d++;
                }
            }
        }
        System.out.println(d);
    }
}
