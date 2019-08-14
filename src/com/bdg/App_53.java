package com.bdg;


import com.bdg.questions.Mutable;

import java.util.Arrays;

/**
 * @author William Arustamyan
 */


public class App_53 {

    public static void change(Mutable mutable){
        mutable.setName("new name");
        mutable.setAddresses(Arrays.asList(new Address(), new Address()));
    }

    public static void main(String[] args) {

        int number = 723;
        int k = 3;
        int miavor = NumberManipulation.miavor(number);
        int tasnavor = NumberManipulation.tasnavor(number);
        int har = NumberManipulation.haryuravor(number);

        if (number > k) {
            System.out.println(number / (miavor + tasnavor + har));
        } else {
            System.out.println(miavor / number);
        }
    }
}
