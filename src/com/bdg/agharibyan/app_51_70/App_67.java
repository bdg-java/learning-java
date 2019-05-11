package com.bdg.agharibyan.app_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_67 {
    public static void main(String[] args) {

        int a = 1024;
        int m = a%10;
        int t = a%100/10;
        int hr = a%1000/100;
        int hz = a%10000/1000;
        int x = m + t + hr + hz;
        int y = x*x;

        if ( a == y ){
            System.out.println("'YES'");
        } else {
            System.out.println("'NO'");
        }
    }
}
