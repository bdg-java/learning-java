package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_154 {
    public static void main(String[]args){

        int n = 17;
        int x = 1;

        for (int i = 1; i <= n; i++){
            if (n%i==3){
                x = x * i;
            }
        }
        System.out.println(x);
    }
}
