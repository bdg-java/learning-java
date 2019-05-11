package com.bdg;


/**
 * @author William Arustamyan
 */


public class App_53 {


    public static void main(String[] args) {

        int number = 723;
        int k = 888;

        int miavor = number % 10;
        int tasnavor = (number / 10) % 10;
        int har = number / 100;

        if (number > k) {
            System.out.println((double) number / (miavor + tasnavor + har));
        } else {
            System.out.println(miavor / number);
        }
    }

}
