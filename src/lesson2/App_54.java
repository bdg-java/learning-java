package lesson2;

public class App_54 {
    public static void main(String[] args) {
        int a = 325;
        int x = a / 100;
        int y = a / 10 % 10;
        int z = a % 10;
        int max = x;

        if (y > x) max = y;
        if (z > x) max = z;
        System.out.print("max =" + max);
        }
    }
