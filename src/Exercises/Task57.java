package Exercises;

public class Task57 {
    public static void main(String[] args) {
        int a = 128;
        int b = a / 100;
        int c = a / 10 % 10;
        int d = a % 10;
        int x = 300;

        if (a > 300) {
            System.out.println(c / d);
    }
        else {
            System.out.println(b / d);
        }
    }
}
