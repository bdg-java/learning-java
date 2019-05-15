package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_181 {
    public static void main (String [] args){

        double n = 256;
        int i = 2;
        int k = 0;

        while ( n >= Math.pow(i,2)){
            n = Math.sqrt(n);
            k++;
        }
        System.out.println(k);
    }
}
