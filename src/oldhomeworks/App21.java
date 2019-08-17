package oldhomeworks;

public class App21 {
    public static void main(String[] args) {
        int a=4151;
        int b=5565;
        int c=258;
        if(a>b && a>c){
            System.out.println("Max:a " +a);
        } else {
            if(b>a && b>c){
                System.out.println("Max:b " +b);
            } else {
                if(c>a && c>b){
                    System.out.println("Max:c " +c);
                }

            }
        }

    }
}
