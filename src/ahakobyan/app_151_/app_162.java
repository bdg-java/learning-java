package ahakobyan.app_151_;

public class app_162 {
    public static void main(String[] args) {

        int a = 1;
        int i;

        for (i = 9999; i >= 1000; i--) {
            int b = i * 14;
            if (Math.sqrt(b) % 1 == 0) {
                a = i;
            }
        }
        System.out.println(a);
    }
}