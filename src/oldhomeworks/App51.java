package oldhomeworks;

public class App51 {
    public static void main(String[] args) {
        int n=459;
        int a;
        int b;
        int c;
        a=n%10;
        b=n/10%10;
        c=n/100%10;


        if(a==b+c){
            boolean t=true;
            System.out.println(t);
        }else {
            boolean t=false;
            System.out.println(t);
        }

    }
}
