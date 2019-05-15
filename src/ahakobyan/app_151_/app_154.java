package ahakobyan.app_151_;

public class app_154 {
    public static void main(String[] args) {

        int a = 1, n = 3,  N = 30, i;

        for (i = 1; i <= N; i++)
            if (i % n == 3){
                a = a* i;
            }System.out.print(a);
    }
}
