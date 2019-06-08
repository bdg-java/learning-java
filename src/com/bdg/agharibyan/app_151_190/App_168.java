package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_168 {
    public static void main(String[]args){

        boolean p = false;
        int n = 5;

        for ( int i = 2; i <= Math.sqrt(n); i++){
            if ( n%i == 0 ) {
                p = false;
            } else {
                p = true;
            }
        }

        if (n == 2 || n == 3){
            p = true;
        }
        System.out.print(p);
    }
}
