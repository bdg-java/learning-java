package Lesson_3;

public class App_118 {
    public static void main(String[] args) {
        double sum = 0;
        int x = 3;
        for (int n = 0; n < 7; n++) {
            sum += Math.abs(Math.pow((2 * x + n), n)) / ((n + 1) * (n + 2));
        }
        System.out.println(sum);
    }
}
