package com.bdg.AGharibyan.App_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_62 {
    public static void main (String [] args) {

        int a = 5234;
        int m = a%10;
        int t = a%100/10;
        int hr = a%1000/100;
        int hz = a%10000/1000;
        int x = a/(m + hr);
        int y = a/(t + hz);

        if ( (m + hr) != 0 ){
            if ( a < 5000 ){
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        }
    }
}
