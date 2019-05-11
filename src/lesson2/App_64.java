package lesson2;

public class App_64 {
    public static void main(String[] args) {
        int a = 4325;
        int x = a / 1000;
        int p = a / 100 % 10;
        int z = a / 10 % 10;
        int k = a % 10;

        if ((k + z) == 5) {
            System.out.println("y = s");
        } else {
            System.out.println("y = d");

        }
    }
}
