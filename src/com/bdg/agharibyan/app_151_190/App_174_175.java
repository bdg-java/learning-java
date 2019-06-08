package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_174_175 {
    public static void main (String [] args){

        int n = 5;
        double x = 2;

        for (int i = 1; i <= n; i++){
            x = 2 + 1/x;
            System.out.println(x);
        }

// App_175

        double x2 = 1;

        for (int i = 1; i <= n; i++){
            x2 = (x2 + 1)/i;
            System.out.println(x2);
        }
    }
}

