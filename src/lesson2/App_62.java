package lesson2;

public class App_62 {
    public static void main(String[] args) {
        int a = 4325;
        int x = a / 1000;
        int y = a / 100 % 10;
        int z = a / 10 % 10;
        int k = a % 10;

        if (a < 5000) {
            System.out.print("a / k + y");
        } else {
            System.out.print("a / x + z");

        }
    }
}