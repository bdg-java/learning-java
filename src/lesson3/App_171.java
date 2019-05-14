package lesson3;

public class App_171 {
    public static void main(String[] args) {
        int N = 20;
        long fact = 1;
        while (N > 0) {
            fact *= N;
            N--;
        }
        System.out.println(fact);
    }
}
