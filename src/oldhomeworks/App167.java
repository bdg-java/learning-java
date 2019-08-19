package oldhomeworks;

import org.w3c.dom.ls.LSInput;

public class App167 {
    public static void main(String[] args) {
        double x = 5;
        boolean y = false;
        int i=1;
        double n = Math.sin(Math.pow(x, i));

        for (i = 1; i <= 30; i++) {

            if (n < 0) {
                y = true;
            }
        }
        System.out.println("n= " + n);
        System.out.println("y = " + y);
    }
}
