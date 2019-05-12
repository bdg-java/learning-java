package ahakobyan;

public class App_53 {
    public static void main(String[] args) {

        int t = 576;
        int k = 843;
        int miavor = t % 10;
        int tasnavor = (t / 10) % 10;
        int har = t / 100;

        if (t > k){
            System.out.print("(double)t / (miavor + tasnavor + har)");
        } else
            System.out.print("miavor / t");
    }
}
