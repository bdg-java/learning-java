package oldhomeworks;

public class App30 {
    public static void main(String[] args) {
        int a=132514;
        int b=5465;
        int c=145;
        if(a<=b && b<=c && a<=c){
            System.out.println("a:"+ a + " " +"b:"+ b  + " " + "c:"+ c);
        } else {
            if(b<=a && b<=c && a<=c){
                System.out.println("b:"+ b + " " + "a:" + a + " " + "c:" + c );
            } else {
                if (a<=b && c<=b && a<=c){
                    System.out.println("a:" + a + " "+ "c:" + c + " " + "b:" + b);
                }else {
                    if (b<=a && b<=c && c<=a){
                        System.out.println("b:" +b +  " "+ "c:" + c + " " + "a:" + a);
                    } else {
                        if(c<=a && c<=b && a<=b){
                            System.out.println("c:" +c + " "+ "a:" + a + " "+ "b:" + b);
                        }else {
                            if (c<=a && c<=b && b<=a){
                                System.out.println("c:" +c + " " + "b:" + b + " " + "a:" + a);

                            }
                        }
                    }
                }
            }
        }
     }
}
