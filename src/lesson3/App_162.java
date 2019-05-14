package lesson3;

public class App_162 {
    public static void main(String[] args) {
        int max = -1;
        for (int i = 1000; i <= 9999; i++) {
            double x = i * 14;
            if (Math.sqrt(x) * 1 == 0.0) {
                max = i;
                break;
            }
        }
        System.out.println(max);
    }
}
