package ahakobyan.app_151_;

public class app_160 {
    public static void main(String[] args) {

        int a = 1;
        int i;

        for (i = 100; i <= 999; i++) {
            double b = i * 16;
            if (Math.sqrt(b) % 1 == 0) {
                a = i;
            }
        }
            System.out.print(a);
    }
}

