package Exercises;

public class Task55 {
    public static void main(String[] args) {
        int a = 120;
        int b = a / 100;
        int c = a / 10 % 10;
        int d = a % 10;
        int min = a;

        if (b < c && b < d) {
            System.out.println(b);
        }
        else if (c < b && c < d){
            System.out.println(c);
        }
        else if (d < b && d < c);
        System.out.println(d);
    }


}
