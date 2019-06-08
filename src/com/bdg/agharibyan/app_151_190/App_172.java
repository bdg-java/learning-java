package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_172 {
    public static void main (String [] args){

        int n = 6;
        int x = 1;

        for ( int i = n; i >= 1; i = i - 2 ){
            x = x * i;
        }
        System.out.print(x);
    }
}
