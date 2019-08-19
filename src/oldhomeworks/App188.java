package oldhomeworks;

public class App188 {
    public static void main(String[] args) {


        int n = 75;
        int f1 = 1;
        int f2 = 1;
        boolean y = false;
        for (int i = 3; i <= 100; i++) {
            if (n == f1 || n == f1 + f2+i)
                y=true;

        }
        System.out.println(y);
    }
}
