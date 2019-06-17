package ahakobyan.app_51_70;

public class App_56 {
    public static void main(String[] args) {

        int t = 192;
        int miavor = t % 10;
        int tasnavor = (t / 10) % 10;
        int har = t / 100;

        if (miavor > tasnavor) {
            System.out.print(+(miavor + tasnavor + har) / t);
        } else
            System.out.print(+ t);
    }
}