package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_151 {
    public static void main (String [] args){

        int n = 4;
        int x = 0;
        for ( int i=1; i <= n; i++){
            if (n%i==0){
                x = x + i;
            }
        }
        System.out.print(x);
    }
}
