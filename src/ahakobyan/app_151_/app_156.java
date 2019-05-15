package ahakobyan.app_151_;

public class app_156 {
    public static void main(String[] args) {

        int n = 0;
        int i;

        for (i = 0; i<= 99; i++)
            if (i % 3 == 0 && i % 5 == 0){
                n = n + i;
            }System.out.print(n);
    }
}
