package ahakobyan;

public class App_65 {
    public static void main(String[] args) {

        int t = 1562;
        int a = t % 10;
        int b = t % 100 / 10;
        int c = (t / 100) % 10;
        int d = t / 1000;

        if ((a * b ) == 12) {
            System.out.print("y = 12");
        }else
            System.out.print("y = 0");
    }
}
