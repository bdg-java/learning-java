package lesson3;

public class App_94 {
    public static void main(String[] args) {
        double x = -4.2, n = 10, sum = 0;
        for(int i = 0; i <= n; i ++) {
            sum = sum * (Math.pow(x,2)-2*x);
            x = (Math.acos(x) / Math.asin(x));
            System.out.println(sum);

        }
    }
}
