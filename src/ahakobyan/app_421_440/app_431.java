package ahakobyan.app_421_440;

public class app_431 {
    public static void main(String[] args) {
        int[][] n = MatrixDefaultDecleration.GetDefaultMatrix();
        int a = 0;
        int b = n.length;

        for (int i = 0; i <n.length; i++) {
            for (int c = b - i - 1; c < b; c++ ) {
                if ((i + c) % 2 != 0) {
                    a++;
                }
            }
        }
        System.out.println(a);
    }
}
