package lesson2;

public class App_61 {
    public static void main(String[] args) {
        boolean t = false;
        int a = 4325;
        int x = a / 1000;
        int y = a / 100 % 10;
        int z = a / 10 % 10;
        int k = a % 10;

        if ((z + k) == (x + y)) {
            t = true;
        } else {
            t = false;

        }
    }
}
