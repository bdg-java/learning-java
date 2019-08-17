package oldhomeworks;

public class App57 {
    public static void main(String[] args) {
        int x=753;
        int a=x%10;
        int b=x/10%10;
        int c=x/100;
        if(x>300) {
            System.out.println( (float) b/a);
        } else {
            System.out.println( (float) c/a);
        }

    }
}
