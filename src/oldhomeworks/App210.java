package oldhomeworks;

public class App210 {
    public static void main(String[] args) {
        int n=745745;
        int odd=0;
        int even=0;
        while (n > 0) {
            odd = odd+ n % 10;
            n = n/ 10;
            even = even + n % 10;
            n = n / 10;
        }
        if (odd == even)
            System.out.println("true");
        else
            System.out.println("false");
    }

}

