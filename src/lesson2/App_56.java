package lesson2;

public class App_56 {
    public static void main(String[] args) {
        int a = 325;
        int x = a / 100;
        int y = a / 10 % 10;
        int z = a % 10;

        if (z > y) {
            System.out.print("x + y + z/a");
        } else {
            System.out.print("a");

        }
    }
}
