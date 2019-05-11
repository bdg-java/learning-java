package com.bdg.agharibyan.app_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_68 {
    public static void main (String[] args){

        int a = 1233;
        int m = a%10;
        int t = a%100/10;
        int h = a%1000/100;
        int mh = m*h;

        if ( m > t ){
            System.out.println(mh);
        } else {
            System.out.println(1);
        }
    }
}
