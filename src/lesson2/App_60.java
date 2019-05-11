package lesson2;

public class App_60 {
    public static void main(String[] args) {
        int a = 325;
        int x = a / 100;
        int y = a / 10 % 10;
        int z = a % 10;

        if ((x > y) && (y > z)) {
            System.out.print(x + "," + y + "," + z);
        } else if((x > z) && (z > y)) {
            System.out.print(x + "," + z + "," + y);
        } else if ((y > x) && (x > z)) {
            System.out.print(y + "," + x + "," + z);
        } else if ((y > z) && (z > x)) {
            System.out.print(y + "," + z + "," + x);
        } else if ((z > x ) && (x > y)) {
            System.out.print(z + "," + x + "," + y);
        } else if ((z > y) && (y > x)) {
            System.out.print(z + "," + y + "," + x);

        }
    }
}
