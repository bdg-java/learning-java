package ahakobyan.app_151_;

public class app_165 {
    public static void main(String[] args) {

        double n = 27;
        boolean t = false;
        double a = Math.sqrt(n);

        for (int i = 1; i<a; i++ ) {
            if (n == Math.pow(3, i)) {
                t = true;
            }
        }
        System.out.println(t);
    }
}