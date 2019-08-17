package oldhomeworks;

public class App55 {
    public static void main(String[] args) {
        int x=412;
        int a=x%10;
        int b=x/10%10;
        int c=x/100;
        if(a<=b && a<=c) {
            System.out.println("Min:" + a);
        } else {
            if (b<=a && b<=c) {
                System.out.println("Min:" + b);
            }else {
                System.out.println("Min:" +c);
            }
        }

    }
}
