package com.bdg.AGharibyan.App_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_63 {
    public static void main(String[] args) {

        int a = 1234;
        int m = a%10;
        int t = a%100/10;
        int hr = a%1000/100;
        int hz = a%10000/1000;

        if ( m == 1 || t == 1 || hr == 1 || hz == 1 ){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}