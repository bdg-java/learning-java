package Exercises;

public class Task60 {
    public static void main(String[] args) {
        int a = 128;
        int b = a / 100;
        int c = a / 10 % 10;
        int d = a % 10;
        if (b > c && b > d) {
            System.out.println(b + " " + c + " " + d);
        } else if (b > d && d > c) {
            System.out.println(b + " " + d + " " + c);
        } else if (c > b && c > d) {
            System.out.println(c + " " + b + " " + d);
        } else if (c > d && d > b) {
            System.out.println(c + " " + d + " " + b);
        } else if (d > b && b > c) {
            System.out.println(d + " " + b + " " + c);
        } else if (d > c && c > b) {
            System.out.println(d + " " + c + " " + b);
        }
    }
}
