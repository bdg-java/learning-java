package lesson3;

public class App_168 {
    public static void main(String[] args) {
        boolean p = true;
        int n = 7;
        double a = Math.sqrt(n);
        for (int i = 2; i <= a; i++) {
            if (n % i == 0) {
                p = false;
                break;
            }
        }
        System.out.println(p);
    }
}
