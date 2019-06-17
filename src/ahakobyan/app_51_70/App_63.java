package ahakobyan.app_51_70;

public class App_63 {
    public static void main(String[] args) {

        int t = 2563;
        int a = t % 10;
        int b = t % 100 / 10;
        int c = (t / 100) % 10;
        int d = t / 1000;

        if (a == 1 || b == 1 || c == 1 || d == 1 ) {
            System.out.print("1");
        }else
            System.out.print("0");
    }
}
