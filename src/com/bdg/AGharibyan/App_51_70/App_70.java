package com.bdg.AGharibyan.App_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_70 {
    public static void main(String[] args) {

        int a = 9999;
        int m = a%10;
        int t = a%100/10;
        int hr = a%1000/100;
        int hz = a%10000/1000;
        int x = m*t*hr*hz;
        int y = 1;

        if ( x > 200 ){
            y = 0;
        } else {
            y = 1;
        }
        System.out.println(y);
    }
}
