package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_153 {
    public static void main (String[]args){

        int n = 10;
        int x = 0;

        for (int i = 1; i <= n; i++){
            if (n%i==2){
                x = x + i;
            }
        }
        System.out.println(x);
    }
}
