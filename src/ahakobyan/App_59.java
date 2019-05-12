package ahakobyan;

public class App_59 {
    public static void main(String[] args) {

        int t = 756;
        int miavor = t % 10;
        int tasnavor = (t / 10) % 10;
        int har = t / 100;

        if (miavor < tasnavor && miavor < har){
            System.out.print(miavor +" " + tasnavor + " " + har);
        } else if (tasnavor < miavor && tasnavor < har) {
            System.out.print(tasnavor + "" + miavor + "" + har);
        }else if (har < miavor && har < tasnavor)
            System.out.print(har + "" + miavor + "" + tasnavor);
    }
}
