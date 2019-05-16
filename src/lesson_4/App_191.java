package lesson_4;

public class App_191 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 6;
        double x = 3;
        for (int i = 0; i <= n; i++) {
            sum += Math.pow(x, i);

        }
        System.out.println(sum);

    }
}
