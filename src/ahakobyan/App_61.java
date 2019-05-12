package ahakobyan;

public class App_61 {
    public static void main(String[] args) {

        int f = 1564;
        int a = f % 10;
        int b = f % 100 / 10;
        int c = (f / 100) % 10;
        int d = f / 1000;
        boolean t;

        if ((a + b) == (c + d)) {
            t = true;
        } else t = false;
            System.out.print(t);
    }
}