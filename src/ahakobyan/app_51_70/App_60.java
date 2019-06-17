package ahakobyan.app_51_70;

public class App_60 {
    public static void main(String[] args) {

        int t = 756;
        int a = t % 10;
        int b = (t/10) % 10;
        int c = t / 100;

        if (a > b && a > c ){
            System.out.print(a + "" + b + "" + c);
        }else if (b > a && a > c){
            System.out.print(b + "" + a + "" + c );
        }else if (c > a && c > b)
            System.out.print(c + "" + a + "" + b);
    }
}
