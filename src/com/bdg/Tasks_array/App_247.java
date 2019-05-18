package com.bdg.Tasks_array;

public class App_247 {
    public static void main(String[] args) {
        int intArray [] = {8,12,27,4,5,8,5,2,4};

        int count = 0;
        int sum = 1;

        for (int i = 0; i <intArray.length ; i++) {

           if(intArray[i] > i ){
             sum +=  Math.sqrt(intArray[i]);
               count += 1;
               System.out.println(sum/count);
           }
        }
        System.out.println(sum/count);

    }
}
