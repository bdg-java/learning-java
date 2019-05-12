package ahakobyan;

public class App_70 {
    public static void main(String[] args) {

        int t = 8798;
        int a = t % 10;
        int b = t % 100 / 10;
        int c = (t / 100) % 10;
        int d = t / 1000;
        int y;

        if ((a * b * c * d) > 200) {
            y = 0;
        }else y = 1;
            System.out.print(+ y);
    }
}
