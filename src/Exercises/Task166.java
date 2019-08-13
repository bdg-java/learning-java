package Exercises;

public class Task166 {
    public static void main(String[] args) {
        int y = 0;
        int n = 32;
        double x = (int) Math.sqrt(n);
        for (int i = 1; i <= x; i++) {
            if (n == Math.pow(4, i)) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
    }
    }
}
