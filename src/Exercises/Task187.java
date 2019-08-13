package Exercises;

public class Task187 {
    public static void main(String[] args) {
        int n = 7;
        boolean t = false;
        int x = (int) Math.sqrt(n);
        for (int i = 2; i <= x; i++) {
            if (i % n == 0) {
                t = false;
                break;
            }
            else t = true;
        }
         System.out.println(t);
    }
}
