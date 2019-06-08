package com.bdg.agharibyan.app_151_190;

public class App_170 {
    public static void main (String [] args){

        int n = 2;
        int a = (int) Math.sqrt(n) + 1;
        double min = 0;

        for (int i = 1; i <= a; i++){
            if (Math.pow(2,i) > n){
                min = Math.pow(2,i);
                break;
            }
        }
        System.out.println((int)min);
    }
}
