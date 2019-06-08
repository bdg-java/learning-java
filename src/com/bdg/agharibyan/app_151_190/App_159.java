package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_159 {
    public static void main(String[]args){

        long x = 1;

        for (int i = 100; i<=999; i++) {
            if (i % 3 == 1 && i % 4 == 2) {
                x = x * i;
            }
        }
    }
}
