package com.bdg.agharibyan.app_21_40;

/**
 * @author Ani Gharibyan
 */
public class App_36 {
    public static void main (String[] args){

        int a = -3;
        int b = 11;
        int c = 1;
        int d = 4;

        int kenter = 0;

        if ( a%2 == 0 ) ;
        else kenter ++;
        if ( b%2 == 0 ) ;
        else kenter ++;
        if ( c%2 == 0 ) ;
        else kenter ++;
        if ( d%2 == 0 ) ;
        else kenter ++;

        if ( kenter > 2 ){
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}
