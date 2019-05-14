package lesson3;

public class App_166 {
    public static void main(String[] args) {
        short y = 0;
        int n = 64;
        double a = Math.sqrt(n);
        for (int i = 1; i <= a; i++) {
            if (n == Math.pow(4, i)) {
                y = 1;
                break;
            }
        }
        System.out.println(y);
    }
}
