package com.bdg.agharibyan.app_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_54 {
    public static void main(String[] args) {

        int a = 879;
        int m = a%10;
        int t = a%100/10;
        int h = a%1000/100;


        if ( m > t && m > h ){
            System.out.println(m);
        } else if ( h > m && h > t ){
            System.out.println(h);
        } else {
            System.out.println(t);
        }
    }
}
