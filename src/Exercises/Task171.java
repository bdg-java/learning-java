package Exercises;

public class Task171 {
    public static void main(String[] args) {
        int n = 6;
        long factorial = 1;
        while (n > 0) {
            factorial *= n;
            n--;
        }
        System.out.println(factorial);
    }
}
