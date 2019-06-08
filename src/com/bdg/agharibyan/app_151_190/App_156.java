package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_156 {
    public static void main(String[]args){

        long x = 1;

        for (int i = 10; i <= 99; i++){
            if(i%3==0 && i%5==0){
                x = x * i;
            }
        }
        System.out.println(x);
    }
}
