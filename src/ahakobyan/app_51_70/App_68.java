package ahakobyan.app_51_70;

public class App_68 {
    public static void main(String[] args) {

        int t = 1567;
        int a = t % 10;
        int b = t % 100 / 10;
        int c = (t / 100) % 10;
        int d = t / 1000;

        if (a > b) {
            System.out.print(+(a * c));
        }else
            System.out.print("1");
    }
}
