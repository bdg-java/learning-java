package ahakobyan;

public class App_66 {
    public static void main(String[] args) {

        int t = 1563;
        int a = t % 10;
        int b = t % 100 / 10;
        int c = (t / 100) % 10;
        int d = t / 1000;

        if (a == 4 || d == 4) {
            System.out.print("YES");
        }else
            System.out.print("NO");
    }
}
