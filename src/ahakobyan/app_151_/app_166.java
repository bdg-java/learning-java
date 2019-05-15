package ahakobyan.app_151_;

public class app_166 {
    public static void main(String[] args) {

        double n = 17;
        int y = 0;
        double a = Math.sqrt(n);

        for (int i = 1; i < a; i++ )
            if (n == Math.pow(4, i)) {
                y = 1;
            }
        System.out.println(y);
    }
}
