package ahakobyan.app_151_;

public class app_164 {
    public static void main(String[] args) {

        int n = 28;
        int i;
        int a= -1;

        for (i = 100; i <= 999; i++) {
            if (Math.sqrt(i) > n) {
                a = i;
                break;
            }
        }
            System.out.println(a);
    }
}
