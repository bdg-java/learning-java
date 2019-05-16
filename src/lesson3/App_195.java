package lesson3;

public class App_195 {
    public static void main(String[] args) {
        int n = 4;
        int a = 1;
        int x = 3;
        double sum = 1;
        for(int i = 1; i <=n; i++) {
            a = i * a;
            sum += Math.pow(x, i) / a;
        }
        System.out.println(sum);
    }
}
