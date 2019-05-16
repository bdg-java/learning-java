package lesson3;

public class App_200 {
    public static void main(String[] args) {
        int n = 4;
        int x = 3;
        double sum = 0;
        double a = 1;
        double b = 1;
        for(int i = 2; i <=n; i++){
            a = a *(2 * i -1);
            b = 2 * i * b;
            sum += Math.pow(- 1, i - 1) * a * Math.pow(x, i ) / b;

        }
        System.out.println(sum);
    }
}
