package Exercises;

public class Task36 {
    public static void main(String[] args) {
        int a = 7;
        int b = 14;
        int c = 21;
        int d = 41;
        if ((a % 2 == 0 && b % 2 == 0)|| (a % 2 == 0 && c % 2 == 0 ) || (a % 2 == 0 && d % 2 == 0) || ((b % 2 == 0 && c % 2 == 0)|| (b % 2 == 0 && d % 2 == 0 ) || (c % 2 == 0 && d % 2 == 0))) {
            System.out.println("2");
        }
        else {
            System.out.println("1");
        }
    }
}
