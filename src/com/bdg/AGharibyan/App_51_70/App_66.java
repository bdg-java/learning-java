package com.bdg.AGharibyan.App_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_66 {
    public static void main (String [] args){

        int a = 1434;
        int t = a%100/10;
        int h = a%1000/100;

        if ( t == 4 || h == 4 ){
            System.out.println("'YES'");
        } else {
            System.out.println("'NO'");
        }
    }
}
