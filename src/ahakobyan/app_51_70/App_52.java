package ahakobyan.app_51_70;

public class App_52 {
    public static void main(String[] args) {

        int t = 576;
        int miavor = t % 10;
        int tasnavor = (t / 10) % 10;
        int har = t / 100;

        if (miavor == tasnavor) {
            System.out.print("TRUE");
        } else if (tasnavor == har) {
            System.out.print("TRUE");
        } else if (miavor == har) {
            System.out.print("TRUE");
        } else
            System.out.print("FALSE");
    }
}
