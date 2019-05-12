package ahakobyan;

public class App_57 {
    public static void main(String[] args) {

        int t = 156;
        int miavor = t % 10;
        int tasnavor = (t / 10) % 10;
        int har = t / 100;

        if (t > 300) {
            System.out.print(+(tasnavor / miavor));
        } else
            System.out.print(+(har / tasnavor));
    }
}