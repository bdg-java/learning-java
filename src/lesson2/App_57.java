package lesson2;

public class App_57 {
    public static void main(String[] args) {
        int a = 325;
        int x = a / 100;
        int y = a / 10 % 10;
        int z = a % 10;
        int k = 300;

        if (a > k) {
            System.out.print("y/z");
        } else {
            System.out.print("x/z");

        }
    }
}