package oldhomeworks;

public class App53 {
    public static void main(String[] args) {
        int a=879;
        int k=564;
        float x=a%10+a/100%10+a/10%10;
        if(a>k) {
            System.out.println(a/x);
        } else {
            System.out.println(x/a);
        }

    }
}
