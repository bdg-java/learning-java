package lesson3;

public class App_104 {
    public static void main(String[] args) {
        double x = -7, y = 8, n = 10, sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum * (Math.pow(x,2) - 2 *y);
            x = Math.pow(x,2);
            y = y + 2;

        }

    }
}
