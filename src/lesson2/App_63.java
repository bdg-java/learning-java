package lesson2;

public class App_63 {
    public static void main(String[] args) {
        int a = 4325;
        int x = a / 1000;
        int y = a / 100 % 10;
        int z = a / 10 % 10;
        int k = a % 10;

        if ((x == 1) || (y == 1) || (z == 1) || (k == 1)) {
            System.out.println("1");
        } else {
            System.out.println("0");

        }
    }
}
