package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_160 {
    public static void main(String[]args){

        int min = 1;

        for (int i = 999; i>=100; i--){
            if (Math.sqrt(i*16)%2==0) {
                min = i;
            }
        }
        System.out.println(min);
    }
}
