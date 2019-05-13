package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_164 {
    public static void main(String[]args){

        int n = 15;
        int min = -1;

        for ( int i = 999; i>=100; i--){
            if (Math.sqrt(i)>n){
                min = i;
            }
        }
        System.out.print(min);
    }
}
