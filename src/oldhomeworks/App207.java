package oldhomeworks;

public class App207 {
    public static void main(String[] args) {
        int n = 52249542;
        boolean y = false;
        while (n > 0) {

                if (n % 10 == 2) {
                    y = true;
                    break;
                }
                n = n / 10;
            }
            System.out.println(y);
        }
    }
