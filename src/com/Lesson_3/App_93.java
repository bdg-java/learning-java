package Lesson_3;

public class App_93 {
    public static void main(String[] args) {
        double x = 0.5;
        double n = 10;
        double multi = 1;
        for (int i = 5; i <= n; i++) {
            multi = multi * (Math.pow(x, 2) + x);
            x = Math.atan(x + 2);
        }
        System.out.println(multi);
    }
    }
