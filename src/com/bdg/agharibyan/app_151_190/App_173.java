package com.bdg.agharibyan.app_151_190;

/**
 * @author Ani Gharibyan
 */
public class App_173 {
    public static void main (String [] args){

        // hashvi chem arel ayn, vor a-n ev b-n irakan tver en. Grel em miayn bnakanneri hamar int-erov.

        int n = 3;
        int a = 1;
        int b = 10;
        int h = (b-a)/n;
        System.out.println(h);

        for( int i = 1; i <= b; i = i + h){
        System.out.println(i);
        }
    }
}
