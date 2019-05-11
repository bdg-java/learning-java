package lesson2;

public class App_67 {
    public static void main(String[] args) {
        int a = 4325;
        int x = a / 1000;
        int p = a / 100 % 10;
        int z = a / 10 % 10;
        int k = a % 10;

        if (a == (x + p + z + k) * (x + p + z + k) ) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
    }
}
