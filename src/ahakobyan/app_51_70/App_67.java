package ahakobyan.app_51_70;

public class App_67 {
    public static void main(String[] args) {

        int t = 1563;
        int a = t % 10;
        int b = t % 100 / 10;
        int c = (t / 100) % 10;
        int d = t / 1000;

        if (t ==(a + b + c + d)*(a + b+ c + d)) {
            System.out.print("YES");
        }else
            System.out.print("NO");
    }
}
