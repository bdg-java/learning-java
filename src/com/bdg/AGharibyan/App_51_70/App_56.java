package com.bdg.AGharibyan.App_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_56 {
    public static void main (String [] args){

        int a = 121;
        int m = a%10;
        int t = a%100/10;
        int h = a%1000/100;
        int x = (m+t+h)/a;

        if ( m > t ){
            System.out.println(x);
        } else {
            System.out.println(a);
        }
    }
}
