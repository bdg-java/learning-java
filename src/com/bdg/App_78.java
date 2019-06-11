package com.bdg;


/**
 * @author William Arustamyan
 */


public class App_78 {

    public static void main(String[] args) {

        double y = 0.0;


        for (int x = 10; x <= 20; x = x + 2) {

            if (x > 12) {
                y = y + 3 * Math.log(x);
            } else {
                y = y + Math.pow(x, 3.0);
            }
        }
    }
}
