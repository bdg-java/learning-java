package lesson3;

public class App_170 {
    public static void main(String[] args) {
        int n = 1022;
        double result = 0;
        int a = (int) Math.sqrt(n) + 1;
        for (int i = 1; i <= a; i++) {
            if (Math.pow(2, i) > n) {
                result = Math.pow(2, i);
                break;
            }
        }
        System.out.println(result);
    }
}
