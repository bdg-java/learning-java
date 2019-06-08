package com.bdg.agharibyan.app_151_190;

public class App_179 {
    public static void main (String [] args){

        int n = 15;
        int k = 6;
        int q = 0;

        while ( n >= k && k != 0){
            n = n - k;
            q++;
        }
        System.out.println(q);
        System.out.println(n);
    }
}
