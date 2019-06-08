package com.bdg.agharibyan.app_51_70;

/**
 * @author Ani Gharibyan
 */
public class App_52 {
    public static void main(String[] args) {

        int a = 110;
        boolean t = true;

        int miavor = a % 10;
        int tasnavor = a % 100 / 10;
        int haryuravor = a % 1000 / 100;

        if (miavor == tasnavor || tasnavor == haryuravor || miavor == haryuravor) {
            t = true;
        } else {
            t = false;
        }
        System.out.println(t);
    }
}

