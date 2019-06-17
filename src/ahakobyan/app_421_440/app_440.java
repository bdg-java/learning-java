package ahakobyan.app_421_440;

public class app_440 {
    public static void main(String[] args) {

        int [][] n = MatrixDefaultDecleration.GetDefaultMatrix();
        int a =0;

        for (int i = 0; i <n.length; i++) {
            for (int f = 0; f < i; f++) {
                if ((i + f) % 2 == 0 ) {
                    a = a + n[i][f];
                }
            }
        }
        System.out.println(a);
    }
}
