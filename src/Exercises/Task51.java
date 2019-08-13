package Exercises;

public class Task51 {
    public static void main(String[] args) {
        int a = 120;
        int b = a / 100;
        int c = a / 10 % 10;
        int d = a % 10;
        boolean t;

        if (b + c == d) {
            t = true;
        } else {
            t = false;
        }
        System.out.println(t);

        }
    }

