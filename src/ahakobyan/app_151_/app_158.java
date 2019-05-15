package ahakobyan.app_151_;

public class app_158 {
    public static void main(String[] args) {

        int n = 1;
        int i;

        for (i = 100; i <= 999; i ++)
            if (i % 2 == 1 && i % 3 == 1) {
                n = n * i;
            }System.out.print(n);
    }
}
