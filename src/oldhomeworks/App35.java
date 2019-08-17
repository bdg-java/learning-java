package oldhomeworks;

public class App35 {
    public static void main(String[] args) {
        int a=11;
        int b=20;
        int c=21;
        int d=52;
        if (a==b+c+d || b==a+c+d || c==a+b+d || d==a+b+c) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }
}
