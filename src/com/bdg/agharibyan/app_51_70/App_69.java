package com.bdg.agharibyan.app_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_69 {
    public static void main(String[] args) {

        int a = 9934;
        int m = a%10;
        int t = a%100/10;
        int hr = a%1000/100;
        int hz = a%10000/1000;
        int y = 1;
        int x = m + t + hr + hz;

        if ( x > 20 ){
            y = 1;
        } else{
            y = 0;
        }
        System.out.println(y);
    }
}
