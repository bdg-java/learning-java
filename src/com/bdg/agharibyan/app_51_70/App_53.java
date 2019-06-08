package com.bdg.agharibyan.app_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_53 {
    public static void main(String[] args) {

        int a = 326;

        int x = a%10;
        int y = a%100/10;
        int z = a%1000/100;
        int k = 3260;
        int h = a/(x+y+z);
        int j = x/a;


        if ( a > k ){
            System.out.println(h);
        } else {
            System.out.println(j);
        }
    }
}
