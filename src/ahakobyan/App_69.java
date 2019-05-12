package ahakobyan;

public class App_69 {
    public static void main(String[] args) {

        int t = 1563;
        int a = t % 10;
        int b = t % 100 / 10;
        int c = (t / 100) % 10;
        int d = t / 1000;
        int y;

        if ((a + b + c + d) > 20) {
            y = 1;
        } else y = 0;
            System.out.print(+ y);
    }
}