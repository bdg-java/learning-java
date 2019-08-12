package Exercises;

public class Task22 {
    public static void main(String[] args) {
        int a = 7;
        int b = 14;
        int c = 21;
        if (a < b) {
            if (a < c) {
                System.out.println("Min :" + a);
            } else {
                System.out.println("Min :" + c);
            }
        } else {
            if (a < c) {
                System.out.println("Min :" + b);
            } else {
                System.out.println("Min :" + c);
            }
        }
    }

}
