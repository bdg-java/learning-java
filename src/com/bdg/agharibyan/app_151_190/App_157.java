package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_157 {
    public static void main(String[]args){

        int x = 0;

        for (int i = 100; i <= 999; i++){
            if (i%5!=0){
                x = x + i;
            }
        }
        System.out.println(x);
    }
}
