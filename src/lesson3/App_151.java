package lesson3;

public class App_151 {
    public static void main(String[] args) {
        int n = 234, sum = 0;
        for(int i = 1; i <= n; i ++) {
            if( n % i == 0)
            sum += i;

        }
        System.out.println(sum);

    }
}
