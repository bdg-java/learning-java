package com.bdg.agharibyan.app_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_57 {
    public static void main (String[] args){

        int a = 363;
        int m = a%10;
        int t = a%100/10;
        int h = a%1000/100;
        int x = t/m;
        int y = h/m;

        if ( m != 0 ){
            if ( a > 300 ){
                System.out.println(x);
            } else {
                System.out.println(y);
            }
        }
    }
}
