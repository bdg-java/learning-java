package com.bdg.AGharibyan.App_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_51 {
    public static void main (String [] args){

        int a = 361;
        boolean t = true;

        int miavor = a%10;
        int tasnavor = a%100/10;
        int haryuravor = a%1000/100;

        if ( miavor == tasnavor + haryuravor ){
            t = true;
        } else {
            t = false;
        }
        System.out.println(t);
    }
}
