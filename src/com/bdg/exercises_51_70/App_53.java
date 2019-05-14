package com.bdg.exercises_51_70;

public class App_53 {
    public static void main(String[] args) {
        int number = 244;
        int k = 2;

        int miavor = number % 10;
        //tasnavor (num/10)%10
        int tasnavor = number % 100 / 10;
        int hayruravor = number / 100;
        int result;
        if(number>k){
            result = number/(miavor+tasnavor+hayruravor);
        }else {
            result  = miavor/number;
        }
        System.out.println(result);

    }
}
