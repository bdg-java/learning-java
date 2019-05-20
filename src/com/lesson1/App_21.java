package lesson1;


public class App_21 {

    public static void main(String[] args) {
        int a = 15;
        int b = 79;
        int c = 47;
        if (a > b) {
            if (a > c) {
                System.out.println(" max : " + a);

            } else {
                if (b > a) {
                    if (b > c) {

                        System.out.println(" max : " + b);
                    } else {
                        System.out.println(" max : " + c);


                    }
                }
            }
        }
    }
}