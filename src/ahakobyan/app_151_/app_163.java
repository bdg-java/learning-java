package ahakobyan.app_151_;

public class app_163 {
    public static void main(String[] args) {

        int a = -1;
        int i;

        for (i = 9999; i >=1000; i--) {
            double b = i * 18;
            if (Math.sqrt(b ) % 1 == 0){
                a = i;
            }
        }
        System.out.print(a);
    }
}
