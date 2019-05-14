package lesson3;

public class App_172 {
    public static void main(String[] args) {
        int N = 8;
        long result = 1;
        while (N >= 1) {
            result *= N;
            N = N - 2;
        }
        System.out.println(result);
    }
}
