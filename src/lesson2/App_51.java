package lesson2;

public class App_51 {
    public static void main(String[] args) {
        boolean t = false;
        int a = 325;
        int x = a / 100;
        int y = a / 10 % 10;
        int z = a % 10;

        if (z == x + y) {
            t = true;
        } else {
            t = false;
        }
        System.out.println(t);
    }
}
