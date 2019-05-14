package lesson3;

public class App_165 {
    public static void main(String[] args) {
        boolean t = false;
        int n = 243;
        double a = Math.sqrt(n);
        for (int i = 1; i <= a; i++) {
            if (n == Math.pow(3, i)) {
                t = true;
                break;
            }
        }
        System.out.println(t);
    }
}
