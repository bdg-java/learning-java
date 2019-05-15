package ahakobyan.app_151_;

public class app_159 {
    public static void main(String[] args) {

        int n = 1;
        int i;

        for (i = 100; i <= 999; i ++)
            if (i % 3 == 1 && i % 4 == 2) {
                n = n * i;
            }System.out.print(n);
    }
}
