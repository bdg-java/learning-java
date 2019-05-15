package com.bdg;

public class App_165 {
    public static void main(String[] args) {

        Boolean t = false;
        int n = 81;


        for ( int i = 1; i <= 1000; i ++){
            if (n == Math.pow(3,i)){
                t = true;
                System.out.println(t);

            }
        }
    }
}
