package lesson3;

public class App_207 {
    public static void main(String[] args) {
        int a = 246;
        boolean t = false;

        while (a > 0) {
            if (a % 10 == 2) {
                t = true;

                break;
            }
            a = a / 10;
        }
        System.out.println(t);
    }
}
