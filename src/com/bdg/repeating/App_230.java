package com.bdg.repeating;

import java.util.Random;

public class App_230 {
    public static void main(String[] args) {
        int k =5;
        int intArray [] = {1,2,3,4,5,6,7,8,9,10,45};

        double sum = 1;
        int cout = 0;
        for (int i = 0; i <intArray.length; i++) {
            if(intArray[i]%k==0){
                sum += Math.pow(intArray[i],2);
                Math.sqrt(intArray[i]);
                cout+=1;
            }
        }
        System.out.println( Math.sqrt(sum)/cout);
    }
}
