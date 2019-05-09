package com.bdg.AGharibyan.App_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_61 {
    public static void main (String [] args){

        int a = 1230;
        boolean t = true;

        int miavor = a%10;
        int tasnavor = a%100/10;
        int haryuravor = a%1000/100;
        int hazaravor = a%10000/1000;

        int x = miavor + tasnavor;
        int y = haryuravor + hazaravor;

//        if ( x == y ){
//            t = true;
//        } else {
//            t = false;
//        }
//        System.out.println(t);

        t = ( x == y ) ? true  : false;
        System.out.println(t);
    }
}
