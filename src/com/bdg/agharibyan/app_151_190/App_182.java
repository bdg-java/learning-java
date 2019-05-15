package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_182 {
    public static void main (String [] args){

        int n = 65536;
        int k = -1;

        for ( int i = 1; Math.pow(i,2)<= n; i++){
            if ( Math.pow(i,2) <= n){
                k = i;
            }
        }
        System.out.println(k);
    }
}
