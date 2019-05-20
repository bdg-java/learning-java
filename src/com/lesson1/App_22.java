package lesson1;

public class App_22 {
    public static void main(String[] args) {
        int a = 369;
        int b = 456;
        int c = 1569;


        if (a < b) {
            if (a < c) {

                System.out.println(" min : " + a);
            } else {

                System.out.println(" min : " + c);
            }
        } else {
            if (b < c) {

                System.out.println(" min : " + b);
            } else {

                System.out.println(" min : " + c);
            }
        }


    }
}


