package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_161 {
    public static void main(String[]args){

        int min = 1;

        for ( int i = 9999; i>=1000; i--){
            if (Math.sqrt(i*26)%2==0){
                min = i;
            }
        }
        System.out.print(min);
    }
}
