package Exercises;

public class Task161 {
    public static void main(String[] args) {
        int min = 0;
        for (int i = 1000; i <= 9999; i++) {
            double x = i * 26;
            if (Math.sqrt(x) % 1 == 0.0) {
                min = i;
                break;
            }
        }
        System.out.println(min);
    }
}
