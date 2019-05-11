package lesson2;

public class App_58 {
    public static void main(String[] args) {
        int a = 315;
        int x = a / 100;
        int y = a / 10 % 10;
        int z = a % 10;

        if ((x+y) <5) {
            System.out.print("f=a");
        } else if ((x+y) > 5) {
            System.out.print("f=b");

        }
    }
}
