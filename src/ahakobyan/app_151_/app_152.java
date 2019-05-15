package ahakobyan.app_151_;

public class app_152 {
    public static void main(String[] args) {

        int a = 1;
        int n = 3;
        int N = 30;
        int i;

        for (i = 1; i <= N; i ++)
            if (i % n == 0){
                a = a * i;
            }System.out.print(a);
    }
}
