package ahakobyan;

public class App_51 {
    public static void main(String []args) {

        int t = 751;
        int miavor = t % 10;
        int tasnavor = (t / 100) % 10;
        int har = t / 100;

        if ((miavor + tasnavor + har) == (tasnavor + har)) {
            System.out.print("TRUE");
        } else
            System.out.print("FALSE");
    }
}
