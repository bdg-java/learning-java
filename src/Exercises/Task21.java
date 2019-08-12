package Exercises;

public class Task21 {
    public static void main(String[] args) {
        int a = 7;
        int b = 14;
        int c = 21;
        if (a > b) {
            if (a > c) {
                System.out.println("Max :" + a);
            } else {
                System.out.println("Max :" + c);
            }
        } else {
            if (a > c) {
                System.out.println("Max :" + b);
            } else {
                System.out.println("Max :" + c);
            }
        }
    }
}
