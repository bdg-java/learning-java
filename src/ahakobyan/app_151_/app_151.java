package ahakobyan.app_151_;

public class app_151 {
    public static void main(String[] args) {

        int a = 0;
        int n = 3;
        int N = 30;
        int i;

        for (i = 0 ; i <= N; i++ )
            if (i % n == 0) {
                a = a + i;
            }System.out.print(a);

    }
}