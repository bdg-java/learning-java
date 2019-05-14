package lesson3;

public class App_152 {
    public static void main(String[] args) {
        int n = 234, mul = 1;
        for(int i = 1; i <= n; i ++) {
            if( n % i == 0)
                mul *= i;

        }
        System.out.println(mul);

    }
}
