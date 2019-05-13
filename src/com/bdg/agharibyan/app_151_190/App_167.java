package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_167 {
    public static void main(String[]args){

        boolean y = true;
        int x = 1;

        for ( int n = 1; n <= 30; n++) {
            if (Math.sin(Math.pow(x, n)) < 0){
                y = true;
            } else {
                y = false;
            }
        }
        System.out.println(y);
    }
}
