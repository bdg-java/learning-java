package Exercises;

public class Task31 {
    public static void main(String[] args) {
        int a = 7;
        int b = 14;
        int c = 21;
        int d = 41;
        if (a > b && a > c && a > d) {
            System.out.println("Max" + a);
        } else if (b > a && b > c && b > d) {
            System.out.println("Max" + b);
        } else if (c > a && c > b && c > d) {
            System.out.println("Max" + c);
        } else if (d > a && d > b && d > c) ;
        System.out.println("Max" + d);
    }
    }



