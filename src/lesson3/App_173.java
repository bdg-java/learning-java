package lesson3;

public class App_173 {
    public static void main(String[] args) {
            int n = 10;
            int a = 2;
            int b = 12;
            double x = (double) (b - a) / n;

            for (double i = a; i <= b; i += x) {
                System.out.println(i);
            }
        }
    }

