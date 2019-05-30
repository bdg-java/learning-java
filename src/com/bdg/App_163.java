package com.bdg;


/**
 * @author William Arustamyan
 */


public class App_163 {

    public static void main(String[] args) {

        int max = -1;
        for (int i = 1000; i <= 9999; i++) {
            double temp = i * 18;
            if (Math.sqrt(temp) % 2 == 0) {
                max = i;
            }
        }

        System.out.println(max);
    }
}
