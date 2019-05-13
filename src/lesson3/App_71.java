package lesson3;

public class App_71 {
    public static void main(String[] args) {
        double x =2.4, y = 0;
        while (x <= 7.6) {
            y += Math.tan(2 * x + x * x);
            x = x + 0.2;
            System.out.println(y);

        }
    }
}
