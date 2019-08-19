package oldhomeworks;

public class App202 {
    public static void main(String[] args) {
       int n=45682;
       int k=0;
        while (n > 0) {
            k = k+ n % 10;
            n= n / 10;
        }
        System.out.println(k);

       }

    }

