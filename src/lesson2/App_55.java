package lesson2;

public class App_55 {
    public static void main(String[] args) {
        int a = 325;
        int x = a / 100;
        int y = a / 10 % 10;
        int z = a % 10;
        int min = x;

        if (y < x) min = y;
        if (z < x) min = z;
        System.out.print("min =" + min);
    }
    }
