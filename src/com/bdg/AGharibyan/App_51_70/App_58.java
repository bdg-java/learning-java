package com.bdg.AGharibyan.App_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_58 {
    public static void main (String [] args){

        int x = 131;
        char f = 'a';
        int t = x%100/10;
        int h = x%1000/100;
        int th = t + h;

        if ( th < 5 ){
            f = 'a';
        } else {
            f = 'b';
        }
        System.out.println(f);
    }
}
