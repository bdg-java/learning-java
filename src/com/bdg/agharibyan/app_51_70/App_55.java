package com.bdg.agharibyan.app_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_55 {
    public static void main(String[] args) {

        int a = 723;
        int m = a%10;
        int t = a%100/10;
        int h = a%1000/100;

        if ( m < t && m < h ){
            System.out.println(m);
        } else if ( t < m && t < h ){
            System.out.println(t);
        } else {
            System.out.println(h);
        }
    }
}
