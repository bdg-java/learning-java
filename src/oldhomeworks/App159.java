package oldhomeworks;

public class App159 {
    public static void main(String[] args) {
        double m = 1;
        for (int i = 100; i <= 999; i++) {
            if (i % 3 == 1 && i % 4 == 2)
                m = m * i;

        }

        System.out.println(m);
    }
}