package com.bdg.agharibyan.app_151_190;

import java.util.Arrays;

/**
 * @author Ani Gharibyan
 */
public class App_177 {
    public static void main (String [] args){

        int n = 5;
        int x1 = 1;
        int x2 = 2;


//        double x = -1;

//        for ( int i = 3; i <= n; i++ ){
//            x = (x1 + 2*x2)/3;
//            System.out.println(x);
//        }

        double [] array = new double[n];
        array[0] = x1;
        array[1] = x2;

        for(int i = 2; i < n; i++){
            array[i] = (array[i-2] + 2*array[i-1])/3;
        }
        System.out.print(Arrays.toString(array));
    }
}
