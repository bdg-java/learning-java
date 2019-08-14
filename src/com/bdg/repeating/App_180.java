package com.bdg.repeating;

public class App_180 {
    public static void main(String[] args) {
        double n = 81;

        Math.sqrt(n);
        System.out.println(  Math.sqrt(n));
        double c = Math.sqrt(n);
        double a =  Math.pow(c,2);
        if( n == a && a%2 == 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }

    }
}
