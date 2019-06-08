package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_180 {
    public static void main (String [] args){

        int n = 2;
        boolean x = false;

        for ( int i = 3; i <= n; i = i*i ){
            if (Math.sqrt(n)== i){
                x = true;
            }
        }
        System.out.println(x);
    }
}
