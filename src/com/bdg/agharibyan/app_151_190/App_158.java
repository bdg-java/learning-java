package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_158 {
    public static void main(String[]args){

        long x = 1;

        for (int i = 100; i <= 999; i++){
            if (i%2!=0 && i%3!=0){
                x = x * i;
            }
        }
        System.out.print(x);
    }
}
